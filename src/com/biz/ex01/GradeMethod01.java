package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = 71;
		int intE = 82;
		int intM = 66;
		int intS = 75;
		
		System.out.println("점수의 평균은 : " + gradeSum(intK, intE, intM, intS));
		
	}
	public static float gradeSum(int intK, int intE, int intM, int intS) {
		float intSum = (intK + intE + intM + intS) / 4;
		return intSum;
	}
	
	
	
}
