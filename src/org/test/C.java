package org.test;

<<<<<<< HEAD
import java.util.Set;
import java.util.TreeSet;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 541192631e2ea28c92f89c60d7142a44b89b3a89

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
