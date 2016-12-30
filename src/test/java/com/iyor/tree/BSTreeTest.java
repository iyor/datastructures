package com.iyor.trees;

import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
import java.util.ArrayList;

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
	public void containsTest() {
		assertTrue(bst.contains(4));	
		assertTrue(bst.contains(2));	
		assertTrue(bst.contains(1));	
		assertTrue(bst.contains(3));	
		assertTrue(bst.contains(6));	
		assertTrue(bst.contains(5));	
		assertTrue(bst.contains(7));	
		assertFalse(bst.contains(0));
	}

	@Test
	public void traversePreOrderTest(){
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(4,2,1,3,6,5,7));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void addDuplicate() {
		bst.add(6);	
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(4,2,1,3,6,5,7));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeRootTest() {
		bst.remove(4);

		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(3,2,1,6,5,7));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}
}
