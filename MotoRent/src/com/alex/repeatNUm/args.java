package com.alex.repeatNUm;

public class args {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("��������������");
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
        	System.out.println("��������ݵĸ�ʽ����");
        }
		catch(ArithmeticException e){
			System.out.println("�����쳣");
		}
	}

}
