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
        // 选择题测试
//        for(Questions quexuanze:qlist){
//            if(quexuanze.getStyleQ()!=null&&quexuanze.getStyleQ().equals("1")){
//                System.out.println(quexuanze.getContextQ());
//                res.add(quexuanze);
//            }
//        }

        /*试题矩阵S
        * 四个属性值为题型，知识点，时间，分值*/
        int[][] S=new int[res.size()][4];
        for(int i=0;i<res.size();i++){
            S[i][0]=Integer.valueOf(res.get(i).getStyleQ()==null?"0":res.get(i).getStyleQ());
            S[i][1]=Integer.valueOf(res.get(i).getIdC()==null?"0":res.get(i).getIdC());
            S[i][2]=Integer.valueOf(res.get(i).getTimeQ()==null?"0":res.get(i).getTimeQ());
            S[i][3]=Integer.valueOf(res.get(i).getScoreQ()==null?"0":res.get(i).getScoreQ());
        }
        for(int i=0;i<S.length;i++){
            for(int j=0;j<S[i].length;j++){
                System.out.print(S[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("============");
        GA Tryer=new GA();
        Tryer.S=S;
        Tryer.ipop = Tryer.initPop(); //产生初始种群
        String str = "";

        for(int i=0;i<1000;i++){

            Tryer.select();
            Tryer.cross();
            Tryer.mutation();
            Tryer.generation = i;

            if(Tryer.bestfitness==0){
                break;
            }
        }
        double[] x = Tryer.calculatefitnessvalue(Tryer.beststr);

        System.out.println(Tryer.beststr.length());
        int ones=0;
        for(char c:Tryer.beststr.toCharArray()){
            if(c=='1')ones++;
        }
        System.out.println(ones);
        str = "最小值" + Tryer.bestfitness + '\n' + "第"
                + Tryer.bestgenerations + "个染色体:<" + Tryer.beststr + ">" + '\n'
                + "w1=" + x[0] + '\n' + "w2=" + x[1]+" w3="+x[2]+" w4="+x[3];

        System.out.println(str);
        System.out.println("============");

        res=new ArrayList<Questions>();
        int i=0;
        for(char c:Tryer.beststr.toCharArray()){
            if(c=='1'){
                System.out.println(qlist.get(i%qlist.size()).getContextQ());
                res.add(qlist.get(i%qlist.size()));
            }
            i++;
        }


        return res;
    }

    //正式出题
    public static List<Questions> Examzhengshi(List<Questions> qlist,
                                               int n)throws Exception{
        List<Questions> reslist=new ArrayList<Questions>();
        for(int i=0;i<n;i++){
            int rand= (int)(Math.random()*reslist.size());
            reslist.add(qlist.get(rand));

            qlist.remove(rand);
        }
        return reslist;
    }
}
