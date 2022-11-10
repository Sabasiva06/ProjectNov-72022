package org.test;

import java.util.ArrayList;
import java.util.List;

public class C {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("c");
		li.add("d");
		li.add("e");
		li.add("f");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

	}

}
