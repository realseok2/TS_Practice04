package com.javaex.practice;

import java.util.Scanner;

public class TS_Ex06 {

	public static void main(String[] args) {

//		Ex06. 주어진 문자열의 공백을 ','(콤마)로 변경 후 출력하세요.
//		char[] c = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 's', 'i', 'l'};

		char[] c = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

		System.out.println("");

		for (int j = 0; j < c.length; j++) {
			if (c[j] == ' ') {
				c[j] = ',';
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}

}
