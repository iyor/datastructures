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
	}

	@Test
	public void addSingleTest() {
		h.add(1);
		assertTrue(h.contains(1));
	}

	@Test
	public void addMultipleElementsTest() {
		h.add(3);
		h.add(1);
		h.add(2);
		assertTrue(h.contains(1));
		assertTrue(h.contains(2));
		assertTrue(h.contains(3));
	}

}
