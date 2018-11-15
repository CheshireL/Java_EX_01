package com.biz.ex01;

public class MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intSum = 50;
		
		System.out.println(retSum(intSum));

	}
	
	public static int retSum(int intSum) {
		intSum += 100;
		
		return intSum;
	}

}
