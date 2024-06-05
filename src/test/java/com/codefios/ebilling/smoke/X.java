package com.codefios.ebilling.smoke;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class X{
	
	
	
	@Test
	public  void test1() {
		System.out.println("Hello from test1 test");
	}
	@Test
	public  void test2() {
		System.out.println("Hello from test2 test");
	}
	@Before
	public void hello() {
		System.out.println("I am hello!");
	}
	@After
	public void bye() {
		System.out.println("I am bye!");
}

}
