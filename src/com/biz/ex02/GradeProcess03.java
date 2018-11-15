package com.biz.ex02;

public class GradeProcess03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 학생 성적계산
		
		for(int intNum=0; intNum < 5; intNum++) {
			
			processGrade(intNum+1);
			
			
		}

	}
	public static void processGrade(int intNum) {
		System.out.println("=============================");
		System.out.println(intNum + "번 학생");
		System.out.println("-----------------------------");
		
		int intK = makeScore();
		int intE = makeScore();
		int intM = makeScore();
		int intS = makeScore();
		int intH = makeScore();
		
		System.out.printf("국어점수 : %d\n",intK);
		System.out.printf("영어점수 : %d\n",intE);
		System.out.printf("수학점수 : %d\n",intM);
		System.out.printf("과학점수 : %d\n",intS);
		System.out.printf("역사점수 : %d\n",intH);
		System.out.println("------------------------------");
		
		makeSum(intK,intE,intM,intS,intH);
		
		
	}
	
	public static void makeSum(int intK, int intE, int intM, int intS, int intH) {
		int intSum = intK+intE+intM+intS+intH;
		System.out.println("총점:" + intSum);
		makeAvg(intSum);
		
	}
	
	public static void makeAvg(int intSum) {
		float intAvg = (float)intSum/5;
		System.out.println("평균:" + intAvg);
	}
	
	
	public static int makeScore() {
		return (int)(Math.random()*(100-50+1))+50;
	}

	

}
