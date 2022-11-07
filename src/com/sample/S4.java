package com.sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class S4 {

	public static void main(String[] args) {

		Map<Integer, String> mp = new Hashtable<Integer, String>();

		mp.put(2, "A");
		mp.put(5, null);
		mp.put(1, null);
		mp.put(6, "b");
		mp.put(2, null);

		// {null=b,1=null,2=null}

		System.out.println(mp);

	}
}





