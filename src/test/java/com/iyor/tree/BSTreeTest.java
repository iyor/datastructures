package com.iyor.trees;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class BSTreeTest {

	BSTree<Integer> bst;

	@Before
	public void testInit() {
		bst = new BSTree<Integer>();
		bst.add(4);
	}

	@Test
	public void testContains() {
		assertTrue(bst.contains(4));	
	}
}
