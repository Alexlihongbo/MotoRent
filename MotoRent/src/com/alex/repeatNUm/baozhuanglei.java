package com.alex.repeatNUm;

public class baozhuanglei {

	public static void main(String[] args) {
		// Integer a=new Integer(3);
		// int i=a;
		// Double j=5.02;
		// j=5.02;
		// double d=j;
		int x = 100;
		Integer i1 = new Integer(x);
		Integer i2 = new Integer("37");
		int a = i2.intValue();
		double b = i2.doubleValue();
		System.out.println("a=" + a + " " + "b=" + b);
		// Integer i3=new Integer("a"); 带有字符串类型的参数，数值类型不对会抛出NumberFormatException
		Double d = new Double(123.234);
		String str = d.toString();
		System.out.println(str);
		System.out.println(d);
		Integer i = Integer.valueOf("234");
		System.out.println("i=" + i);
	}

}
