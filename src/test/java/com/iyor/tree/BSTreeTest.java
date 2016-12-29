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
		bst.add(2);
		bst.add(1);
		bst.add(3);
		bst.add(6);
		bst.add(5);
		bst.add(7);
	}

	@Test
	public void testContains() {
		assertTrue(bst.contains(4));	
		assertTrue(bst.contains(2));	
		assertTrue(bst.contains(1));	
		assertTrue(bst.contains(3));	
		assertTrue(bst.contains(6));	
		assertTrue(bst.contains(5));	
		assertTrue(bst.contains(7));	
	}
}
