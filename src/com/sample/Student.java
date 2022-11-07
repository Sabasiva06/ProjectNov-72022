package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student {

	public static void main(String[] args) {

		List li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add("a");
		li.add('a');
		li.add(20.08f);
		li.add(true);

		for (int i = 0; i < li.size(); i++) {
			Object object = li.get(i);
			String simpleName = object.getClass().getSimpleName();
			//System.out.println(simpleName);
			if (simpleName.equals("Integer")) {
				System.out.println(li.get(i));
			}

		}

	}

}
