package com.alex.repeatNUm;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		Collection  c=new ArrayList();
		c.add("�����");
		c.add(6);
		//System.out.println("c����Ԫ�صĸ�����"+c.size());
		c.remove(6);
		//System.out.println("c����Ԫ�صĸ�����"+c.size());
		// System.out.println("c�������Ƿ����������ա��ַ�����"+c.contains("�����"));
		c.add("java�����");
		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection books=new HashSet();
		books.add("������JavaӦ��");
		books.add("java�����");
		System.out.println("c�������Ƿ���ȫ����books����"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c������Ԫ��"+c);
		c.clear();
		System.out.println("c�е�Ԫ�أ�"+c);
		books.retainAll(c);
		System.out.println("books�����е�Ԫ�أ�"+books);
		}

}
