package com.javaex.practice;

public class TS_Ex02 {

	public static void main(String[] args) {

//		Ex02. double 형 배열을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.

		double[] doubleArray = new double[3];

		doubleArray[0] = 6.7;
		doubleArray[1] = 3.3;
		doubleArray[2] = 1.2;

		for (int i = 0; i <= 2; i++) {
			System.out.println(doubleArray[i]);
		}

	}

}
