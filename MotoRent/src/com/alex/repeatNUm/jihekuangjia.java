package com.alex.repeatNUm;

import java.util.*;

public class jihekuangjia {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello,");
		list.add("world,");
		list.add("hahahhaha");
		// ��һ�ֱ������� for��ǿ
		// for(String str:list) {
		// System.out.println(str);
		// }
		// �ڶ��ֱ������� ��������������ص����ݽ��б���
		// String[] str=new String[list.size()];
		// list.toArray(str);
		// for(int i=0;i<str.length;i++) {
		// System.out.println(str[i]);
		// }
		// �����ֱ������� iterator
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
