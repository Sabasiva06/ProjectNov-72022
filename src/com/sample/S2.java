package com.sample;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//Unchecked or RunTime Exception
public class S2 {

	public static void main(String[] args) {
		//Arithmatic Exception
//		System.out.println(10);
//		System.out.println(10/2);
//		System.out.println(10/0);
		
		//Null Pointer Exception
//		Map<String, Integer>m = new TreeMap();
//		m.put(null, null);
//		System.out.println(m);
		
		//Input Mismatch Exception
//		Scanner s = new Scanner(System.in);
//		s.nextInt();
		
		//ArrayIndexOutOfBoundsException
//		int [] a = new int [3];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		System.out.println(a[10]);
		
		//StringIndexOutOfBoundsException
//		String s ="Java";
//		char charAt = s.charAt(10);
//		System.out.println(charAt);
		
		//Index Out of Bounds Exception
//		List li = new ArrayList();
//		li.add(10);
//		li.add(20);
//		System.out.println(li.get(10));
		
		//NumberFormat Exception
//		String s ="123ab";
//		//to convert a string into Integer
//		int parseInt = Integer.parseInt(s);
//		System.out.println(parseInt+5);
		
		//ClassCastException
//		Set s = new TreeSet();
//		s.add(10);
//		s.add("Java");
//		System.out.println(s);
		
//		int a = 123;
//		String valueOf = String.valueOf(a);
//		System.out.println(valueOf+5);
		
		//Exception Handling
		try {
		System.out.println(10/0);
		}
		catch(NullPointerException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("super class of Exception");
		}
		finally {
			System.out.println("pls refer exception");
		}
		
		
		System.out.println("test");
		
		
		
	}

	
}
