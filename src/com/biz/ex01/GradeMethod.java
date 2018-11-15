package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intK = 80; 
		int intE = 70;
		int intM = 60;
			
		
		System.out.println("총합점수 :" + gradeSum(intK,intE,intM));
		
		

	}
	
	public static int gradeSum(int intK, int intE, int intM) {
		int intSum = intK + intE + intM;
		
		return intSum;
	}

}
