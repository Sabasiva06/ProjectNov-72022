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

		Map<String, String> mp = new Hashtable<String, String>();

		// To add a Data in Map
		mp.put("name", "Mani");
		mp.put("email", "mani@gmail.com");
		mp.put("course", "Automation Testing");
		mp.put("institute", "Greens");
		mp.put("branch", "OMR");

		// {null=b,1=null,2=null}

		System.out.println(mp);

	}
}
