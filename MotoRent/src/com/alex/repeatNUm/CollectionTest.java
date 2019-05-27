package com.alex.repeatNUm;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		Collection  c=new ArrayList();
		c.add("孙悟空");
		c.add(6);
		//System.out.println("c集合元素的个数："+c.size());
		c.remove(6);
		//System.out.println("c集合元素的个数："+c.size());
		// System.out.println("c集合中是否包含“孙悟空”字符串："+c.contains("孙悟空"));
		c.add("java疯狂讲义");
		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collection books=new HashSet();
		books.add("轻量级Java应用");
		books.add("java疯狂讲义");
		System.out.println("c集合中是否完全包括books集合"+c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合中元素"+c);
		c.clear();
		System.out.println("c中的元素："+c);
		books.retainAll(c);
		System.out.println("books集合中的元素："+books);
		}

}
