package com.gdes.GDES.model.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProfessionalCompetenceEvaluation {
	/**
	 * 能力点得分
	 * @param question_knowledge 试题与知识点权重矩阵
	 * @param knowledge_ability 知识点与能力点权重矩阵
	 * @param score_question 得分与试题矩阵
	 * @param time 所耗时间的占比转换
	 * @param professional_requirement 专业要求
	 * @return 结果
	 */
	public static double[][] AbilityScore(double[][] question_knowledge, double[][] knowledge_ability,
			double[][] score_question) {
		double[][] question_ability = ColumnRatioByRow(MatrixMultiplication(question_knowledge, knowledge_ability));
		double[][] score_ability = MatrixMultiplication(score_question, question_ability);
		for (int i = 0; i < score_ability.length; i++) {
			for (int j = 0; j < score_ability[0].length; j++) {
				score_ability[i][j] = roundOffTwoDecimalPlaces(score_ability[i][j]);
			}
		}
		return score_ability;
	}

	/**
	 * 按行的列占比
	 * 
	 * @param dou
	 * @return
	 */
	public static double[][] ColumnRatioByRow(double[][] dou) {
		double[] OneRow = new double[dou.length];
		for (int i = 0; i < dou.length; i++) {
			for (int j = 0; j < dou[0].length; j++) {
				OneRow[i] = OneRow[i] + dou[i][j];
			}
		}
		double[][] result = new double[dou.length][dou[0].length];
		for (int i = 0; i < dou.length; i++) {
			for (int j = 0; j < dou[0].length; j++) {
				if(OneRow[i]==0) {
					result[i][j] = 0;
				} else {
					result[i][j] = roundOffTwoDecimalPlaces(dou[i][j] / OneRow[i]);
				}
			}
		}
		return result;
	}

	/**
	 * 矩阵乘法
	 * @param A 矩阵A
	 * @param B 矩阵B
	 * @return 结果矩阵
	 */
	public static double[][] MatrixMultiplication(double[][] A, double[][] B) {
		double[][] result = new double[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < B.length; k++) {
					result[i][j] = result[i][j] + roundOffTwoDecimalPlaces(A[i][k] * B[k][j]);
				}
			}
		}
		return result;
	}

	/**
	 * 四舍五入保留两位小数
	 * @param d
	 * @return
	 */
	public static double roundOffTwoDecimalPlaces(double d) {
		BigDecimal bd = new BigDecimal(d);
		return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
