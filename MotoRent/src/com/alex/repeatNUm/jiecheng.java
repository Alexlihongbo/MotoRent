package com.alex.repeatNUm;

public class jiecheng {

	public static void main(String[] args) {
		int m=5;
        int result=fact(m);
        System.out.println(result);
	}

	public static int fact(int n) {
		int t = 1;
		for (int i = 1; i <= n; i++) {
			t = t * i;
		}
		return t;

	}
}
