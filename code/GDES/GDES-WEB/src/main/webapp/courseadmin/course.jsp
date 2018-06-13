<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    session.setAttribute("basePath", basePath);
%>

<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze UI Admin index Examples</title>
    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="icon" type="image/png" href="../assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <script src="../assets/js/echarts.min.js"></script>
    <link rel="stylesheet" href="../assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="../assets/css/amazeui.datatables.min.css"/>
    <link rel="stylesheet" href="../assets/css/app.css">
    <script src="../assets/js/jquery.min.js"></script>
    <%--<script src="../assets/js/jquery.min.js"/>--%>
    <script type="text/javascript">

        $(document).ready(function(){
//            $(".tpl-table-black-operation-del")
//            $(".tpl-table-black-operation-del").click(function () {
            $(document).on('click',".tpl-table-black-operation-del",function () {
                var empId = $(this).attr("del-id");
                alert(empId);
                var courseName = $(this).parents("tr").find("td:eq(2)").text();
//                alert(courseName);
                if(confirm("确认删除【"+courseName+"】吗？")){

                    var url = "/course/deleteByidC.do";
                    var data = {
                        idC:empId
                    };
                    $.ajax({
                        type: 'GET',
                        url: url,
                        data: data,
                        success: function (result) {
                           alert(result.msg);
                           to_page(currentPage);
                           find(currentPage);
                        }
                    });
                }

            });
//                var empId = $(this).attr("del-id");
//                alert("5555555555");
            });
//        });

        var totalRecord,currentPage;
        $(function () {
            to_page(1);
//            $.ajax({
//                url:"/course/selectCourse1.do",
//                data:"pn=1",
//                type:"GET",
//                success:function(result){
//                    alert("fdfdf");
//                    console.log(result);
//                }
//            });
        });

        function to_page(pn,courseType) {
            var url = "/course/selectCourse1.do";
            var data = {
                pn:pn,
                courseType: courseType
            };
//            var html;
            $.ajax({
                type: 'GET',
                url: url,
                data: data,
                success: function (result) {
                    build_emps_table(result);
//                    alert("1111111111");
                    build_page_nav(result,courseType);
//                    alert("2222222");
                }
            });
        }

/* <td>
                <div class="tpl-table-black-operation">
                    <a href="javascript:;">
                        <i class="am-icon-pencil"></i> 编辑
                    </a>
                    <a href="javascript:;" class="tpl-table-black-operation-del">
                        <i class="am-icon-trash"></i> 删除
                            </a>
                        </div>
                    </td>


*/
        function select() {
//            nameC = $("#find").val();
//            alert(v);
            var url = "/course/findCourseBynameC.do";
            var data = {
                pn:pn,
                nameC: nameC
            };
//            var html;
            $.ajax({
                type: 'GET',
                url: url,
                data: data,
                success: function (result) {
                    alert("1111111111");
                    build_emps_table(result);
                    alert("222222");
                    build_page_nav_find(result,nameC)
                }
            })
        }
        function build_emps_table(result){
            $("#example-r tbody").empty();
            var courses=result.extend.pageInfo.list;
            $.each(courses,function (index,item) {
//                var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
                var indexTd=$("<td></td>").append(index+1);
                var courseCodeTd=$("<td></td>").append(item.courseCode);
                var coursenameCTd=$("<td></td>").append(item.nameC);

                //onclick="/course/selectCourseByidC.do?idC=item.idC"
                 url1='/course/selectCourseByidC?idC='+item.idC;
                var editTd=$("<a onclick='select()' data-am-modal=\"{target: '#doc-modal-2', closeViaDimmer: 0, width: 400, height: 600}\"></a>").append("编辑");
                editTd.attr("edit-id",item.idC);
                var delTd=$("<a style='cursor: pointer'></a>").addClass("tpl-table-black-operation-del").append("删除");
                delTd.attr("del-id",item.idC);
                var divTd=$("<div></div>").addClass("tpl-table-black-operation");
                var btnTd = $("<td></td>").append(divTd).append(editTd).append(" ").append(delTd);
//                var btnTd=$("<td></td>").append("删除");

                $("<tr></tr>").append(indexTd)
                    .append(courseCodeTd)
                    .append(coursenameCTd)
                    .append(btnTd)
                    .appendTo("#example-r tbody");
            });

        }
        /*
        * <ul class="am-pagination tpl-pagination">
                                        <li class="am-disabled"><a href="#">«</a></li>
                                        <li class="am-active"><a href="#">1</a></li>
                                        <li><a href="#" >2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li><a href="#">5</a></li>
                                        <li><a href="#">»</a></li>
                                    </ul>
        * */

        function build_page_nav(result,courseType){
            currentPage = result.extend.pageInfo.pageNum;
            $("#page_nav_area").empty();
//            alert("5555555555");
            var ul = $("<ul></ul>").addClass("am-pagination tpl-pagination");
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
            var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
            if(result.extend.pageInfo.hasPreviousPage == false){
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            }else{
                //为元素添加点击翻页的事件
                firstPageLi.click(function(){
                    to_page(1,courseType);
                });
                prePageLi.click(function(){
                    to_page(result.extend.pageInfo.pageNum -1,courseType);
                });
            }

            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
            if(result.extend.pageInfo.hasNextPage == false){
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            }else{
                nextPageLi.click(function(){
                    to_page(result.extend.pageInfo.pageNum +1,courseType);
                });
                lastPageLi.click(function(){
                    to_page(result.extend.pageInfo.pages,courseType);
                });
            }

            //添加首页和前一页 的提示
            ul.append(firstPageLi).append(prePageLi);
            //1,2，3遍历给ul中添加页码提示
            $.each(result.extend.pageInfo.navigatepageNums,function(index,item){

                var numLi = $("<li></li>").append($("<a></a>").append(item));
                if(result.extend.pageInfo.pageNum == item){
                    numLi.addClass("active");
                }
                numLi.click(function(){
                    to_page(item,courseType);
                });
                ul.append(numLi);
            });
            //添加下一页和末页 的提示
            ul.append(nextPageLi).append(lastPageLi);

            //把ul加入到nav
            var navEle = $("<nav></nav>").append(ul);
            navEle.appendTo("#page_nav_area");

        }

        //根据课程类型查询
        function byCourseType(type){
            to_page(1,type);
        }

        //搜索
        function bynameC() {
            find(1);
        }
        function find(pn,nameC) {
            nameC = $("#find").val();
//            alert(v);
            var url = "/course/findCourseBynameC.do";
            var data = {
                pn:pn,
                nameC: nameC
            };
//            var html;
            $.ajax({
                type: 'GET',
                url: url,
                data: data,
                success: function (result) {
                    alert("1111111111");
                    build_emps_table(result);
                    alert("222222");
                    build_page_nav_find(result,nameC)
                }
            })
        }
        function build_page_nav_find(result,nameC){
            $("#page_nav_area").empty();
//            alert("5555555555");
            var ul = $("<ul></ul>").addClass("am-pagination tpl-pagination");
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
            var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
            if(result.extend.pageInfo.hasPreviousPage == false){
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            }else{
                //为元素添加点击翻页的事件
                firstPageLi.click(function(){
                    find(1,nameC);
                });
                prePageLi.click(function(){
                    find(result.extend.pageInfo.pageNum -1,nameC);
                });
            }

            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
            if(result.extend.pageInfo.hasNextPage == false){
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            }else{
                nextPageLi.click(function(){
                    find(result.extend.pageInfo.pageNum +1,nameC);
                });
                lastPageLi.click(function(){
                    find(result.extend.pageInfo.pages,nameC);
                });
            }

            //添加首页和前一页 的提示
            ul.append(firstPageLi).append(prePageLi);
            //1,2，3遍历给ul中添加页码提示
            $.each(result.extend.pageInfo.navigatepageNums,function(index,item){

                var numLi = $("<li></li>").append($("<a></a>").append(item));
                if(result.extend.pageInfo.pageNum == item){
                    numLi.addClass("active");
                }
                numLi.click(function(){
                    find(item,nameC);
                });
                ul.append(numLi);
            });
            //添加下一页和末页 的提示
            ul.append(nextPageLi).append(lastPageLi);

            //把ul加入到nav
            var navEle = $("<nav></nav>").append(ul);
            navEle.appendTo("#page_nav_area");

        }

//        $(".tpl-table-black-operation-del").on("click",function () {
        $(".tpl-table-black-operation-del").click(function () {
            var empId = $(this).attr("del-id");
            alert("5555555555");
        });

        $(document).ready(function(){
            $(".tpl-table-black-operation-del").click(function () {
                var empId = $(this).attr("del-id");

//                alert("5555555555");
            });
        });
//        function deletebyidC() {
//            var idC = $(this).attr("del-id");
//            alert(idC);
//        }

        //单个删除
        <%--$(document).on("click",".tpl-table-black-operation-del",function(){--%>
            <%--//1、弹出是否确认删除对话框--%>
            <%--var courseName = $(this).parents("tr").find("td:eq(2)").text();--%>
            <%--var empId = $(this).attr("del-id");--%>
            <%--//alert($(this).parents("tr").find("td:eq(1)").text());--%>
            <%--if(confirm("确认删除【"+courseName+"】吗？")){--%>
                <%--//确认，发送ajax请求删除即可--%>
                <%--$.ajax({--%>
                    <%--&lt;%&ndash;url:"${APP_PATH}/emp/"+empId,&ndash;%&gt;--%>
                    <%--url:"course/deleteByidC.do",--%>
                    <%--type:"GET",--%>
                    <%--data:{--%>
                        <%--idC:empId--%>
                    <%--}--%>
                    <%--success:function(result){--%>
                        <%--alert(result.msg);--%>
                        <%--//回到本页--%>
<%--//                        to_page(currentPage);--%>
                    <%--}--%>
                <%--});--%>
            <%--}--%>
        <%--});--%>
    </script>
</head>

<body data-type="widgets">
<script src="../assets/js/theme.js"></script>
<div class="">


    <!-- 内容区域 -->
    <div class="">
        <div class="row-content am-cf">
            <div class="row">
                <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
                    <div class="widget am-cf">
                        <div class="widget-head am-cf">
                            <div class="widget-title  am-cf">知识点列表 ${message}</div>


                        </div>
                        <div class="widget-body  am-fr">

                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-6">
                                <div class="am-form-group">
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-success"
                                                    data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0, width: 400, height: 600}">
                                                <span class="am-icon-plus"></span> 新增
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-secondary"><span
                                                    class="am-icon-save"></span> 保存
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-warning"><span
                                                    class="am-icon-archive"></span> 审核
                                            </button>
                                            <button type="button" class="am-btn am-btn-default am-btn-danger" onclick="/course/selectCourse.do"><span
                                                    class="am-icon-trash-o"></span> 刷新
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
                                <div class="am-form-group tpl-table-list-select">
                                    <select data-am-selected="{btnSize: 'sm'}" onchange="byCourseType(this.value)">
                                        <%--<option value="按课程类型查询">按课程类型查询</option>--%>
                                        <option value="111">全部课程</option>
                                        <option value="理工类">理工类</option>
                                        <option value="管理类">管理类</option>
                                        <option value="经济类">经济类</option>
                                        <option value="语言类">语言类</option>
                                        <option value="艺术类">艺术类</option>
                                        <option value="公共基础课">公共基础课</option>
                                    </select>
                                </div>
                            </div>
                            <div class="am-u-sm-12 am-u-md-12 am-u-lg-3">
                                <div class="am-input-group am-input-group-sm tpl-form-border-form cl-p">
                                    <input type="text" class="am-form-field " placeholder="请搜索" value="" id="find">
                                    <span class="am-input-group-btn">
            <button class="am-btn  am-btn-default am-btn-success tpl-table-list-field am-icon-search"
                    type="button" onclick="bynameC()"></button>
          </span>
                                </div>
                            </div>

                            <div class="am-u-sm-12">
                                <table width="100%" class="am-table am-table-compact am-table-striped tpl-table-black "
                                       id="example-r">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>课程代码</th>
                                        <th>课程名称</th>
                                        <%--<th>知识点占比</th>--%>
                                        <%--<th>备注</th>--%>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody id="tablelist">

                                    </tbody>
                                </table>
                            </div>
                            <div class="am-u-lg-12 am-cf">
                                <div class="am-fr" id="page_nav_area">
                                    <%--<ul class="am-pagination tpl-pagination">--%>
                                        <%--<li class="am-disabled"><a href="#">«</a></li>--%>
                                        <%--<li class="am-active"><a href="#">1</a></li>--%>
                                        <%--<li><a href="#" >2</a></li>--%>
                                        <%--<li><a href="#">3</a></li>--%>
                                        <%--<li><a href="#">4</a></li>--%>
                                        <%--<li><a href="#">5</a></li>--%>
                                        <%--<li><a href="#">»</a></li>--%>
                                    <%--</ul>--%>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

<!-- 添加知识点 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-1">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">添加课程
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <form class="am-form" method="post" action="/course/addCourse.do">
            <fieldset>

                <div class="am-form-group" hidden>
                    <label for="nameC">课程id</label>
                    <input type="text" class="" id="" name="idC" placeholder="">
                </div>
                <div class="am-form-group">
                    <label for="nameC">课程名称</label>
                    <input type="text" class="" id="nameC" name="nameC" placeholder="">
                </div>

                <div class="am-form-group">
                    <label for="courseCode">课程代码</label>
                    <input type="text" class="" id="courseCode" name="courseCode" placeholder="">
                </div>
                <div class="am-form-group">
                    <label for="doc-select-1">课程类型</label>
                    <select id="doc-select-1" name="courseType">
                        <option value="理工类">理工类</option>
                        <option value="管理类">管理类</option>
                        <option value="经济类">经济类</option>
                        <option value="语言类">语言类</option>
                        <option value="艺术类">艺术类</option>
                        <option value="公共基础课">公共基础课</option>
                    </select>
                    <span class="am-form-caret"></span>
                </div>
                <div class="am-form-group">
                    <label for="introduction">课程备注</label>
                    <input type="text" class="" id="introduction" name="introductionC" placeholder="">
                </div>

                <p>
                    <button type="submit" class="am-btn am-btn-default">提交</button>
                </p>
            </fieldset>
        </form>
    </div>
</div>

<!-- 修改知识点 -->
<div class="am-modal am-modal-no-btn" tabindex="-1" id="doc-modal-2">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">修改课程
            <a href="javascript: void(0)" class="am-close am-close-spin" data-am-modal-close>&times;</a>
        </div>
        <form class="am-form" method="post" action="/course/editCourse.do">
            <fieldset>

                <div class="am-form-group" hidden>
                    <label for="nameC">课程id</label>
                    <input type="text" class="" id="idC_edit" name="idC" placeholder="">
                </div>
                <div class="am-form-group">
                    <label for="nameC">课程名称</label>
                    <input type="text" class="" id="nameC_edit" name="nameC" placeholder="">
                </div>

                <div class="am-form-group">
                    <label for="courseCode">课程代码</label>
                    <input type="text" class="" id="courseCode_edit" name="courseCode" placeholder="">
                </div>
                <div class="am-form-group">
                    <label for="doc-select-1">课程类型</label>
                    <select id="doc-select-1_edit" name="courseType">
                        <option value="理工类">理工类</option>
                        <option value="管理类">管理类</option>
                        <option value="经济类">经济类</option>
                        <option value="语言类">语言类</option>
                        <option value="艺术类">艺术类</option>
                        <option value="公共基础课">公共基础课</option>
                    </select>
                    <span class="am-form-caret"></span>
                </div>
                <div class="am-form-group">
                    <label for="introduction">课程备注</label>
                    <input type="text" class="" id="introduction_edit" name="introductionC" placeholder="">
                </div>

                <p>
                    <button type="submit" class="am-btn am-btn-default">提交</button>
                </p>
            </fieldset>
        </form>
    </div>
</div>
<!-- 删除模态框 -->
<div class="am-modal am-modal-confirm" tabindex="-1" id="my-confirm">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">提 示</div>
        <div class="am-modal-bd">
            你，确定要删除这条记录吗？
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-cancel>取消</span>
            <span class="am-modal-btn" id="confirm-del" onclick="deletecomfirm()">确定</span>
        </div>
    </div>
</div>
<!-- 删除提示 -->
<script type="text/javascript">
//        $('#confirm-del').on('click', function (code) {
//            //        alert("delete1");
//            //        var courseCode=
//        });

//    function deleteByCode(code) {
//
//        alert(code);
//        if (confirm("delete or not?")) {
//            var courseCode = code;
//            var url = "/course/deleteCourseByCourseCode.do?courseCode=" + courseCode;
//            var data = {
//                courseCode: courseCode
//            };
//            $.ajax({
//                type: 'post',
//                url: url,
//                data: data,
//                success: function (result) {
//
//                    if (result.trim() == 1) {
//                        alert("删除成功");
//                    } else {
//                        alert("删除失败");
//                    }
//                }
//            });
//        }
//
//
//
//    }
    //    var nameC=$("#find").val();
    //    //            alert(v);
    //    var url="/course/findCourseBynameC.do";
    //    var data={
    //        nameC:nameC
    //    };
    //    var html;
    //    $.ajax({
    //        type:'post',
    //        url:url,
    //        data:data,
    //        success:function (result) {
    //            //循环出结果
    ////                    alert(result.length);
    //            for(var i=0;i<result.length;i++) {
    ////                        alert("courseCode="+result[i].courseCode);
    //                html+='<tr> '+
    //                    '<td>'+(i+1)+'</td>' +
    //                    '<td>'+result[i].courseCode+'</td>' +
    //                    '<td>'+result[i].nameC+'</td>' +
    //                    '<td>'+'删除'+'<td>' + '<tr>'
    //            }
    //
    ////                    alter("html");
    //            $("#tablelist").html("");
    ////                    alter("html78d77878");
    //
    ////                    $("#tablelist").after(html);
    //            $("#tablelist").append(html);
    //
    ////                    alter("1");
    ////                    $("#example-r #tablelist").af(html);
    //        }
    //    })
    //    }

</script>

<script src="../assets/js/amazeui.min.js"></script>
<script src="../assets/js/amazeui.datatables.min.js"></script>
<script src="../assets/js/dataTables.responsive.min.js"></script>
<script src="../assets/js/app.js"></script>

</body>

</html>