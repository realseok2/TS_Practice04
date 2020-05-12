package com.javaex.practice;

public class TS_Ex04 {

	public static void main(String[] args) {

//		Ex04. 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 그 합을 아래와 같이 출력하는 프로그램을 작성하세요.
//		
//		double[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};

		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

		int sum = 0;
		int count = 0;

		System.out.println("주어진 배열 내의 3의 배수인 수들은 아래와 같습니다.");

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				sum = sum + data[i];
				count = count + 1;
			}
		}
		System.out.println("주어진 배열 내의 3의 배수의 갯수는 " + count + "입니다.");
		System.out.println("주어진 배열 내의 3의 배수의 합계는 " + sum + "입니다.");
	}

}
