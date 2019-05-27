package com.alex.repeatNUm;

import java.util.*;

public class jihekuangjia {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello,");
		list.add("world,");
		list.add("hahahhaha");
		// 第一种遍历方法 for增强
		// for(String str:list) {
		// System.out.println(str);
		// }
		// 第二种遍历方法 把链表编程数组相关的内容进行遍历
		// String[] str=new String[list.size()];
		// list.toArray(str);
		// for(int i=0;i<str.length;i++) {
		// System.out.println(str[i]);
		// }
		// 第三种遍历方法 iterator
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
