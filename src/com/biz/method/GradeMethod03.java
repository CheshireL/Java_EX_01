package com.biz.method;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어,영어,수학,과학 성적을 저장할 int형 변수선언.
		// 각 과목의 점수를 50~100까지 범위의 임의의 정수를 생성하여 변수에 저장.
		// gradeSum() Method 생성하여, 매개변수 2개를 전달받아 전과목 성적 총점을 계산 하고
		// main으로 결과를 return 한 다음 console에 표시
		
		int intK = (int)(Math.random()*100-50+1)+50;
		int intE = (int)(Math.random()*100-50+1)+50;
		int intM = (int)(Math.random()*100-50+1)+50;
		int intS = (int)(Math.random()*100-50+1)+50;
		
		int intSum = gradeSum(intK,intE);
		intSum += gradeSum(intM,intS);
		 		
		System.out.println("국어:" + intK);
		System.out.println("영어:" + intE);
		System.out.println("수학:" + intM);
		System.out.println("과학:" + intS);
		System.out.println("총점:" + intSum);
		
		System.out.println("평균:" + ((float)intSum/4));
		
	}
	public static int gradeSum(int intNum1, int intNum2) {
		int intSum = intNum1+intNum2;
		return intSum;
				
	}

}
