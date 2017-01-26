package com.iyor.trees;

import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HeapTest {

	Heap<Integer> h;

	@Before
	public void testInit() {
		h = new Heap<Integer>();
		h.add(3);
		h.add(1);
		h.add(2);
	}


	@Test
	public void baseTest() {
		assertTrue(h.contains(1));
		assertTrue(h.contains(2));
		assertTrue(h.contains(3));
		assertEquals(0, h.findIndex(3));
		assertEquals(1, h.findIndex(1));
		assertEquals(2, h.findIndex(2));

	}

}
