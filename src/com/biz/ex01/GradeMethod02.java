package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intK = 88;
		int intE = 76;
		int intM = 62;
		int intS = 71;
		
		int intSum = gradeSum(intK,intE,intM,intS);
		
		
		System.out.println("점수평균 : " + (intSum/4));
				

	}
	
	public static int gradeSum(int intK, int intE, int intM, int intS) {
		int intSum = intK + intE + intM + intS;
		return intSum;
	}

}
