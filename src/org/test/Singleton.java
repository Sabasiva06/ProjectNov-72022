package org.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Singleton {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

	@After
	public void after() {
		System.out.println("It will execute after each @test Method");
	}

	@Before
	public void before() {
		System.out.println("It will execute before each @test");

	}

	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void singUp() {

		System.out.println("Sing Up");
	}
}
