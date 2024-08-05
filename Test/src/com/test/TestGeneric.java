package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {
		List list = new ArrayList(1);
		list.add(new Integer(1));
		Object o = list.get(0);
		System.out.print((String) o);
	}

}
