package com.javaex.practice;

public class TS_Ex08 {

	public static void main(String[] args) {

//		Ex08. 배열을 사용하여 1 ~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요. - 미니로또 - 
//					 (중복체크 할 것!)

		System.out.println("Lotto 번호를 생성하는 프로그램입니다.");
		System.out.println("7번째로 생성되는 번호는 보너스 번호입니다.\n");

		int[] LottoNo = new int[7];

		for (int i = 0; i < LottoNo.length; i++) {
			LottoNo[i] = (int) (Math.random() * 45) + 1;
			for (int k = i-1; k >= 0; k--) {
				if (LottoNo[i] == LottoNo[k]) {
					i--;
					break;
				}
			}

		}

		for (int i = 0; i < LottoNo.length; i++) {
			System.out.println(">> " + (i+1) + "번째로 생성된 로또 번호는 " + LottoNo[i] + " 입니다.");

		}

	}
}
