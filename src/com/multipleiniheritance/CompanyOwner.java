package com.multipleiniheritance;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompanyOwner {

	public static void main(String[] args) {

		int[] a = { 1, 4, 6, 3, 5, 4, 1 };
		// 1,1,3,4,4,5,6
		Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			int j = a[i];

			if (mp.containsKey(j)) {
				Integer integer = mp.get(j);
				mp.put(j, integer + 1);
			} else {
				mp.put(j, 1);
			}
		}
		java.util.List<Integer> li = new ArrayList<>();

		Set<Entry<Integer, Integer>> entrySet = mp.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			Integer key = entry.getKey();
			li.add(key);
		}
		Collections.sort(li);
		System.out.println(li);
		System.out.println(li.get(1));
	}
}
