package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고 
		// 총점과 평균을 계산하시오.
		
		int intK = 89;
		int intE = 76;
		int intM = 62;
		int intS = 71;
		int intH = 92;
		
		int intSum = gradeSum(intK,intE,intM,intS,intH);
	

		
		System.out.println(intSum);
		System.out.println(intSum/5);

	}
	public static int gradeSum(int intK, int intE, int intM, int intS, int intH) {
		int intSum = intK+intE+intM+intS+intH;
		return intSum;
	}

}
