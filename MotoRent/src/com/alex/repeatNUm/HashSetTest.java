package com.alex.repeatNUm;

import java.util.*;

class R {
	int count;

	public R(int count) {
		this.count = count;
	}

	public String toString() {
		return "R[count:" + count + "]";
	}
}

public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
        System.out.println(hs);
	}

}
