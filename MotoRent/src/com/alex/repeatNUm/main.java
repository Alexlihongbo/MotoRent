package com.alex.repeatNUm;

public class main {
   @SuppressWarnings("finally")
public static int ret() {
	   try {
		   int i =1/0;
		   return 0;
//	   }catch(Exception e) {
//		   return 1;
	   }finally {
		   return 2;
	   }
	   
   }
}
