package com.biz.method;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// guguDan() method를 선언하고, main에서 2부터 9까지 반복되는 숫자를 매개변수로
		// guguDan()에 전달하여 2단 부터 9단까지의 구구단을 console에 출력하시오
		
		
		for(int i = 2; i <= 9; i++) {
			guguDan(i);
		}
		
		
	}
	
	public static void guguDan(int intG) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(intG);
				System.out.print(" x ");
				System.out.print(j);
				System.out.print(" = ");
				System.out.println(intG*j);
			}
			
		}
		
	}


