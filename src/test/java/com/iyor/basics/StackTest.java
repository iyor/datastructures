package com.iyor.basics;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class StackTest {

	Stack<Integer> st;
	
	@Before
	public void testInit() {
		this.st = new Stack<Integer>();
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
	}

	@Test
	public void popTest() {
		assertTrue(1==st.pop());	
		assertTrue(2==st.pop());	
		assertTrue(3==st.pop());	
		assertTrue(4==st.pop());	
	}
}
