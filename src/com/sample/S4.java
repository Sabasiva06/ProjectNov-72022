package com.sample;

import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class S4 {
	

	public static void main(String[] args) {
		
		Set<String> st = new LinkedHashSet<String>();
		
		st.add("Raja");
		st.add("rajan@gmail.com");
		st.add("JAVA");
		st.add("Automation");
		st.add("OMR");
	
		Map<Integer, String> mp = new Hashtable<Integer, String>();
		//To add a Data in Map
		mp.put(2, "A");
		mp.put(5, null);
		mp.put(1, null);
		mp.put(6, "b");
		mp.put(2, null);

		// {null=b,1=null,2=null}

		System.out.println(mp);

	}
}





