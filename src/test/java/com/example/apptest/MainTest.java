package test.java.com.example.apptest;

import junit.framework.TestCase;



public class MainTest extends TestCase {

	
	public void testMethod(){
		System.out.println("result: ");
		this.assertEquals('a', 'a');
		
	}
	
	public void testMethod2(){
		System.out.println("result2: ");
		this.assertEquals('a', 'a');
		
	}
}
