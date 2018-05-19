package com.gdes.GDES.controller;

import com.gdes.GDES.model.Latestabilityscore;
import com.gdes.GDES.model.Studentpost;
import com.gdes.GDES.service.LatestabilityscoreService;
import com.gdes.GDES.service.StudentpostService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * excle的下载
 */
@Controller
@RequestMapping("/excle/")
public class ExcleController {
    @Resource
    private LatestabilityscoreService latestabilityscoreService;

    @Resource
    private StudentpostService studentpostService;

    /**
     * 整个专业
     * @param id_m
     * @param response
     * @return
     */
    @RequestMapping("down")
    public String mydown(String id_m, String pid_m, String id_s, HttpServletResponse response) {
        System.out.println(1111111);
        System.out.println(id_s);

        try {
            ServletOutputStream out = response.getOutputStream();
            try {
                if(id_m!=null) {
                    //设置头文件，最后为设置下载文件名
                    response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(id_m + ".xls", "UTF-8"));
                }
                if(id_s!=null) {
                    response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(id_s + ".xls", "UTF-8"));
                }
                if(pid_m!=null) {
                    response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(pid_m + "职位.xls", "UTF-8"));
                }
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
            if(id_m!=null) {
                String[] titles = {"学号", "姓名", "能力点编号", "能力点名称", "得分", "更新时间"};
                export(titles, out, id_m, null, null);
                return "redirect:/las/allbymajorid.do?id_m=" + id_m;
            }
            else if(id_s!=null) {
                String[] titles = {"学号", "姓名", "能力点编号", "能力点名称", "得分", "更新时间"};
                export(titles, out, null, null, id_s);
                return "redirect:/las/listbystudentid.do?id_s=" + id_s;
            }
            else if(pid_m!=null) {
                String[] titles = {"学号", "姓名", "职位编号", "职位名称", "得分", "更新时间"};
                export(titles, out, null, pid_m, null);
                return "studentpost/listbymajorid.do?id_m=" + pid_m;
            }
            else {
                return "";
            }

        } catch (Exception e) {
            e.printStackTrace();
            if(id_m!=null) {
                return "redirect:/las/allbymajorid.do?id_m=" + id_m;
            }
            else if(id_s!=null) {
                return "redirect:/las/listbystudentid.do?id_s=" + id_s;
            }
            else if(pid_m!=null) {
                return "studentpost/listbymajorid.do?id_m=" + pid_m;
            }
            else {
                return "";
            }
        }
    }

    public void export(String[] titles, ServletOutputStream out, String id_m, String pid_m, String id_s) throws Exception {
        try {
            //第一步，创建一个workbook，对应一个excle文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            //第二步，在workbook中添加一个sheet，对应excle文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");
            //第三步，在sheet中添加表头第0行（行数限制short）
            HSSFRow row = hssfSheet.createRow(0);
            //第四步，创建单元格，并设计表头 设置表居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();

            //居中样式
            hssfCellStyle.setAlignment(HorizontalAlignment.CENTER);


            //hssfSheet.autoSizeColumn(1, true); //自适应宽度

            HSSFCell hssfCell = null;
            for (int i = 0; i < titles.length; i++) {
                hssfCell = row.createCell(i); //列索引从0开始
                hssfCell.setCellValue(titles[i]); //列名1
                hssfCell.setCellStyle(hssfCellStyle);
            }

            //第五部找出数据
            List<Latestabilityscore> latestAbilityScores = null;
            List<Studentpost> studentpostList = null;
            if(id_m!=null) {
                latestAbilityScores = latestabilityscoreService.getListByMajorId(id_m);
            }
            else if(id_s!=null){
                latestAbilityScores = latestabilityscoreService.queryByStudentId(id_s);
            }
            else if(pid_m!=null) {
                studentpostList = studentpostService.getListByMajorId(pid_m);
            }
            int i = 1;
            if(latestAbilityScores!=null) {
                for (Latestabilityscore las : latestAbilityScores) {
                    row = hssfSheet.createRow(i);
                    row.createCell(0).setCellValue(las.getIdS()); //学号
                    row.createCell(1).setCellValue(las.getStudent().getNameS()); //姓名
                    row.createCell(2).setCellValue(las.getIdAp()); //能力点编号
                    row.createCell(3).setCellValue(las.getAbilitypoint().getNameAp()); //能力点名称
                    row.createCell(4).setCellValue(las.getScoreLas()); //得分
                    row.createCell(5).setCellValue(las.getTimeLas()); //更新时间
                    i++;
                }
            }
            if(studentpostList!=null) {
                for (Studentpost sp : studentpostList) {
                    row = hssfSheet.createRow(i);
                    row.createCell(0).setCellValue(sp.getIdS()); //学号
                    row.createCell(1).setCellValue(sp.getStudent().getNameS()); //姓名
                    row.createCell(2).setCellValue(sp.getPost().getIdP()); //能力点编号
                    row.createCell(3).setCellValue(sp.getPost().getNameP()); //能力点名称
                    row.createCell(4).setCellValue(sp.getScoreSp()); //得分
                    row.createCell(5).setCellValue(sp.getTimeSp()); //更新时间
                    i++;
                }
            }

            hssfSheet.autoSizeColumn((short)0); //自适应宽度
            hssfSheet.autoSizeColumn((short)1);
            hssfSheet.autoSizeColumn((short)2);
            hssfSheet.autoSizeColumn((short)3);
            hssfSheet.autoSizeColumn((short)4);
            hssfSheet.autoSizeColumn((short)5);

            //第六步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("导出失败！");
        }
    }

}
