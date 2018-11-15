package com.biz.method;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int intStars = 10;
		//for(int i = 0; i < intStars ; i++) {
		//	for(int j = 0; j < intStars; j++) {
		//		System.out.println("* ");
		//	}
		//	System.out.println("* ");
		//}

			makeStars(7);
			makeStars(10);
			makeStars(13);
			makeStars(16);
	}
	
	public static void makeStars(int intStars) {
		//int intStars = 5;
		
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0; j < intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
