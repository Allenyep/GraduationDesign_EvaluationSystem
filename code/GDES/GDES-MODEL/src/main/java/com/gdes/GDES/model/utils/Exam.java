package com.gdes.GDES.model.utils;

import com.gdes.GDES.model.Historytestpaper;
import com.gdes.GDES.model.Questions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Allen on 2018/5/20.
 */
public class Exam {

    //练习测试算法
    public static List<Questions> Examlianxi(List<Questions> qlist,
                                             List<Historytestpaper> htplist)throws Exception{
        List<Questions> reslist=new ArrayList<Questions>();
        for(Historytestpaper htp:htplist){
            for(Questions q:qlist){
                if(!htp.getIdQ().equals(q.getIdQ())){
                    //未做过的试题
                    reslist.add(q);
                }
            }
        }
        //从reslist当中随机选择5道
        if(reslist.size()<5){
            reslist.addAll(qlist.subList(0,5));
        }
        List<Questions> res=new ArrayList<Questions>();
        for(int i=0;i<5;i++){
            int rand= (int)(Math.random()*reslist.size());
            res.add(reslist.get(rand));
            reslist.remove(rand);
        }
        return res;
    }
}
