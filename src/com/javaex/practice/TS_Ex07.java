package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex07 {

	public static void main(String[] args) {

//		Ex07. 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권 ,10000원권 5000원권, 1000원권,
//					 500원 동전, 100원 동전, 50원 동전, 5원 동전, 1원 동전이 각각 몇 개로 변환 되는지 작성하세요.
//					 (아래의 배열을 사용하여 코딩하세요.)

		Scanner sc = new Scanner(System.in);

		int[] wonArray = new int[10];

		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		int[] wonCount = new int[wonArray.length];

		int money = 0;

		System.out.println("사용자에게 입력받은 금액을 큰 액수의 화폐부터 순서대로 분류하여 주는 프로그램입니다.");
		System.out.print("금액을 입력해 주세요 : ");
		money = sc.nextInt();

		for (int i = 0; i < wonArray.length; i++) {
			if (money >= wonArray[i]) {
				wonCount[i] = money / wonArray[i];
				money = money - (wonArray[i] * wonCount[i]);
			}
			System.out.println(wonArray[i] + "원 : " + wonCount[i] + " 개");
		}

		sc.close();

	}

}
