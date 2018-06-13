package com.gdes.GDES.model.utils;

/**
 * 遗传算法
 * Created by Allen on 2018/6/7.
 */
public class GA {
    public int ChrNum = 10;	//染色体数量
    public String[] ipop = new String[ChrNum];	 	//一个种群中染色体总数
    public int generation = 0; 	//染色体代号
    public static final int GENE = 92; 		//基因数
    public double bestfitness = Double.MAX_VALUE;  //函数最优解
    public int bestgenerations;   	//所有子代与父代中最好的染色体
    public String beststr;   		//最优解的染色体的二进制码

    public int[][] S;     //试题集矩阵

    /**
     * 初始化一条染色体（用二进制字符串表示）
     */
    public String initChr() {
        String res = "";
        for (int i = 0; i < GENE; i++) {
            if (Math.random() > 0.5) {
                res += "0";
            } else {
                res += "1";
            }
        }
        return res;
    }

    /**
     * 初始化一个种群(10条染色体)
     */
    public String[] initPop() {
        String[] ipop = new String[ChrNum];
        for (int i = 0; i < ChrNum; i++) {
            ipop[i] = initChr();
        }
        return ipop;
    }

    /**
     * 将染色体转换成w变量的值
     */
    public double[] calculatefitnessvalue(String str) {
        int a = Integer.parseInt(str.substring(0, 23), 2);
        int b = Integer.parseInt(str.substring(23, 46), 2);
        int c = Integer.parseInt(str.substring(46, 69), 2);
        int d = Integer.parseInt(str.substring(69, 92), 2);

        double w1 =  a * (6.0 - 0) / (Math.pow(2, 23) - 1);    //w1的基因
        double w2 =  b * (6.0 - 0) / (Math.pow(2, 23) - 1);    //w2的基因
        double w3 =  c * (6.0 - 0) / (Math.pow(2, 23) - 1);    //w3的基因
        double w4 =  d * (6.0 - 0) / (Math.pow(2, 23) - 1);    //w4的基因

        double fitness[]=new double[str.length()];
        double minfitness=Double.MAX_VALUE;
        //试题矩阵行数对应试题查找最优值
        for(int i=0;i<S.length;i++){
            fitness[i]=S[i][0]*w1+S[i][1]*w2+S[i][2]*w3+S[i][3]*w4+1;
            if(minfitness>fitness[i])
                minfitness=fitness[i];
        }
//		System.out.println(minfitness);

//		double fitness2=theta1*w1+theta2*w2+theta3*w3+theta4*w4;
        double[] results={w1,w2,w3,w4,minfitness};
        return results;
    }

    /**
     * 轮盘选择
     * 计算群体上每个个体的适应度值;
     * 按由个体适应度值所决定的某个规则选择将进入下一代的个体;
     */
    public void select() {
        double evals[] = new double[ChrNum]; // 所有染色体适应值
        double p[] = new double[ChrNum]; // 各染色体选择概率
        double q[] = new double[ChrNum]; // 累计概率
        double F = 0; // 累计适应值总和
        for (int i = 0; i < ChrNum; i++) {
            evals[i] = calculatefitnessvalue(ipop[i])[4];
//			System.out.println(evals[i]);
            if (evals[i] < bestfitness){  // 记录下种群中的最小值，即最优解
                bestfitness = evals[i];
                bestgenerations = generation;
                beststr = ipop[i];
//				System.out.println(evals[i]);
            }

            F = F + evals[i]; // 所有染色体适应值总和
        }

        for (int i = 0; i < ChrNum; i++) {
            p[i] = evals[i] / F;
            if (i == 0)
                q[i] = p[i];
            else {
                q[i] = q[i - 1] + p[i];
            }
        }
        for (int i = 0; i < ChrNum; i++) {
            double r = Math.random();
            if (r <= q[0]) {
                ipop[i] = ipop[0];
            } else {
                for (int j = 1; j < ChrNum; j++) {
                    if (r < q[j]) {
                        ipop[i] = ipop[j];
                    }
                }
            }
        }
    }

    /**
     * 交叉操作 交叉率为60%，平均为60%的染色体进行交叉
     */
    public void cross() {
        String temp1, temp2;
        for (int i = 0; i < ChrNum; i++) {
            if (Math.random() < 0.60) {
                int pos = (int)(Math.random()*GENE)+1;     //pos位点前后二进制串交叉
                temp1 = ipop[i].substring(0, pos) + ipop[(i + 1) % ChrNum].substring(pos);
                temp2 = ipop[(i + 1) % ChrNum].substring(0, pos) + ipop[i].substring(pos);
                ipop[i] = temp1;
                ipop[(i + 1) / ChrNum] = temp2;
            }
        }
    }

    /**
     * 基因突变操作 1%基因变异
     */
    public void mutation() {
        for (int i = 0; i < 4; i++) {
            int num = (int) (Math.random() * GENE * ChrNum + 1);
            int chromosomeNum = (int) (num / GENE) + 1; // 染色体号

            int mutationNum = num - (chromosomeNum - 1) * GENE; // 基因号
            if (mutationNum == 0)
                mutationNum = 1;
            chromosomeNum = chromosomeNum - 1;
            if (chromosomeNum >= ChrNum)
                chromosomeNum = 9;
            String temp;
            String a;   //记录变异位点变异后的编码
            if (ipop[chromosomeNum].charAt(mutationNum - 1) == '0') {    //当变异位点为0时
                a = "1";
            } else {
                a = "0";
            }
            //当变异位点在首、中段和尾时的突变情况
            if (mutationNum == 1) {
                temp = a + ipop[chromosomeNum].substring(mutationNum);
            } else {
                if (mutationNum != GENE) {
                    temp = ipop[chromosomeNum].substring(0, mutationNum -1) + a
                            + ipop[chromosomeNum].substring(mutationNum);
                } else {
                    temp = ipop[chromosomeNum].substring(0, mutationNum - 1) + a;
                }
            }
            //记录下变异后的染色体
            ipop[chromosomeNum] = temp;
        }
    }


    public static void main(String[] args) {
        GA Tryer=new GA();
        int[][] S={{3,1,3,1},{2,1,2,20},{1,3,2,3}};
        Tryer.S=S;
        Tryer.ipop = Tryer.initPop(); //产生初始种群
        String str = "";

        for(int i=0;i<100;i++){
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
    }
}
