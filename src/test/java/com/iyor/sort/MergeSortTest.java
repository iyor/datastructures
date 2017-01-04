package com.iyor.sort;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class MergeSortTest {

	Integer[] intArray;

	@Before
	public void testInit() {
		intArray = new Integer[] {3,2,6,8,4,6,5,3,10,3,11,-2,123,123};	
	}

	@Test
	public void singleElementTest() {
		Integer[] arr = new Integer[] {3,2,6};	
		Integer[] sorted = MergeSort.sort(arr);
		Integer[] expected = {2};
		assertTrue(Arrays.equals(sorted, expected));
	}

//	@Test
//	public void mergeSortTest() {
//		Integer[] sorted = MergeSort.sort(intArray);
//		Integer[] expected = {-2, 2, 3, 3, 3, 4, 5, 6, 6, 8, 10, 11, 123, 123};
//		assertTrue(Arrays.equals(sorted, expected));
//	}
}
