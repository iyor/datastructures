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
		bst.add(40);
		bst.add(20);
		bst.add(10);
		bst.add(30);
		bst.add(60);
		bst.add(50);
		bst.add(70);
	}

	@Test
	public void containsTest() {
		assertTrue(bst.contains(40));	
		assertTrue(bst.contains(20));	
		assertTrue(bst.contains(10));	
		assertTrue(bst.contains(30));	
		assertTrue(bst.contains(60));	
		assertTrue(bst.contains(50));	
		assertTrue(bst.contains(70));	
		assertFalse(bst.contains(0));
	}

	@Test
	public void traversePreOrderTest(){
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,20,10,30,60,50,70));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void addDuplicate() {
		bst.add(60);	
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,20,10,30,60,50,70));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeNonExistantEltTest() {
		bst.remove(80);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,20,10,30,60,50,70));

		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeLeafTest() {
		bst.remove(10);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,20,30,60,50,70));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeRootTest() {
		bst.remove(40);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(30,20,10,60,50,70));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeDepth1EltTest() {
		bst.remove(20);	
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,10,30,60,50,70));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

	@Test
	public void removeDepth2EltTest() {
		bst.add(5);
		bst.add(15);
		bst.add(25);
		bst.add(35);
		bst.add(45);
		bst.add(55);
		bst.add(65);
		bst.add(75);

		bst.remove(60);

		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.addAll(Arrays.asList(40,20,10,5,15,30,25,35,55,50,45,70,65,75));
		
		ArrayList<Integer> result = bst.traversePreOrder();
		assertTrue(expected.equals(result));
	}

}
