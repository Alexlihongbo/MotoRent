package com.alex.repeatNUm;

public class args {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("请输入两个整数");
			return;
		}
		int a,b,result;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			result=a/b;
			System.out.println("result="+result);
		}
        catch(NumberFormatException e) {
        	System.out.println("输入的数据的格式有误");
        }
		catch(ArithmeticException e){
			System.out.println("算术异常");
		}
	}

}
