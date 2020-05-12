package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Ex05. 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.

		System.out.println("사용자에게 5개의 숫자를 입력 받아 해당 숫자들의 평균을 구하는 프로그램입니다.");
		int sum = 0;

		int[] data = new int[5];

		for (int i = 0; i < data.length; i++) {
			System.out.print("숫자 : ");
			data[i] = sc.nextInt();
			sum = sum + data[i];
		}

		System.out.println((double) sum / (double) data.length);

		sc.close();

	}

}
