package com.alex.repeatNUm;

import java.util.Scanner;

public class repeatNum {
	public static void getRepeatNum(int[] num) {
		int changenum;
		System.out.println("�ظ������ǣ�");
		for (int index = 0; index < num.length; index++) {
			while (num[index] != index) {
				if (num[index] == num[num[index]]) {
					System.out.print(num[index] + " ");
					break;
				} else {
					changenum = num[num[index]];
					num[num[index]] = num[index];
					num[index] = changenum;
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("������һ�����ݣ�");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		getRepeatNum(num);
	}
}