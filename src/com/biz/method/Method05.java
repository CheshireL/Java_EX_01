package com.biz.method;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <10; i++) {
		
		int intKor = makeGrade(); 
		//(int)(Math.random() * (100-50+1)) + 50; // 50부터 100까지

		int intEng = makeGrade(); 
		//(int)(Math.random() * (100-50+1)) + 50; // 50부터 100까지
		
		int intMat = makeGrade();
		int intHis = makeGrade();
		int intSci = makeGrade();
		int intMus = makeGrade();
		
		//int intSum = intKor + intEng;
		int intSum = gradeSum(intKor,intEng);
		intSum += gradeSum(intMat,intSci);
		intSum += gradeSum(intHis,intMus);
		
		System.out.printf("국어 : %d, 영어 : %d 합계 = %d \n", intKor,intEng,intSum);
		
		}
	}
	public static int makeGrade() {
		int intRND = (int)(Math.random() * (100-50+1)) + 50;
		return intRND;
	}
	
	public static int gradeSum(int intKor, int intEng) {
		return intKor + intEng;
		
	}

}
