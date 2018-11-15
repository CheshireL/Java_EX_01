package com.biz.method;

public class RndSurm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 문을 이용하여 0부터 16까지 반복문 작성
		// 50부터 100까지 임의의 숫자를 생성하여 생성된 숫자를 모두 합산.
		// 합산된 숫자의 평균을 계산하여 console에 표시.
		int i = 0;
		int intSum = 0;
		int intAvg = 0;
		for( i = 0 ; i < 16 ; i++) {
			int j = (int)(Math.random() *100-50+1) + 50;
			
			intSum += i;
			
			//intAvg += intSum / 16;
			
		}
		
		intAvg = intSum / i;
		System.out.println(intAvg);
		
	}

}
