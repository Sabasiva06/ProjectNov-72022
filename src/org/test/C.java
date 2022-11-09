package org.test;

import java.util.Set;
import java.util.TreeSet;

public class C {

	public static void main(String[] args) {

		Set<Integer> si = new TreeSet<>();
		si.add(1);
		si.add(2);
		si.add(3);
		si.add(4);
		si.add(5);
		si.add(6);

		for (Integer integer : si) {
			System.out.println(integer);
		}

	}

}
