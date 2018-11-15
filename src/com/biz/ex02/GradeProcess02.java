package com.biz.ex02;

public class GradeProcess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 학생 성적을 처리하려고 한다 *for를 이용 5번 실행
		// 각 학생의 국어, 영어, 수학, 과학, 국사 과목의 성적을 임의로 설정하고
		// 총점과 평균을 계산하시오
		// 총점은 gradeSum() method를 선언하여 계산을 수행
		
		for(int i = 0; i <5; i++) {
			
			
			int intK = scoleRan();
			int intE = scoleRan();
			int intM = scoleRan();
			int intS = scoleRan();
			int intH = scoleRan();
			
			int intSum = gradeSum(intK,intE,intM,intS,intH);			
			
			System.out.println((i+1)+ "번 학생");
			System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 과학 : %d, 국사 : %d ", intK,intE,intM,intS,intH);
			System.out.println();
			System.out.println("총점 : " + intSum);
			System.out.println("평균 : " + (float)intSum/5);
			System.out.println("=========================");
		}	
	}
		

	
	public static int gradeSum(int intK, int intE, int intM, int intS, int intH) {
		return intK+intE+intM+intS+intH;
	
		}
	public static int scoleRan() {
		return (int)(Math.random()*100-50+1)+50;
	}

}
