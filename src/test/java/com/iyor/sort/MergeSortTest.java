package com.iyor.sort;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

	@Test
	public void singleElementTest() {
		Integer[] arr = new Integer[] {2};	
		Integer[] sorted = MergeSort.sort(arr);
		Integer[] expected = {2};
		assertTrue(Arrays.equals(sorted, expected));
	}

	@Test
	public void simpleSortTest() {
		Integer[] arr = new Integer[] {3,2};	
		Integer[] sorted = MergeSort.sort(arr);
		Integer[] expected = {2,3};
		assertTrue(Arrays.equals(sorted, expected));
	}

	@Test
	public void oddLengthArrayTest() {
		Integer[] arr = new Integer[] {3,2,6};	
		Integer[] sorted = MergeSort.sort(arr);
		Integer[] expected = {2,3,6};
		assertTrue(Arrays.equals(sorted, expected));
	}

//	@Test
//	public void mergeSortTest() {
//		Integer[] sorted = MergeSort.sort(intArray);
//		Integer[] expected = {-2, 2, 3, 3, 3, 4, 5, 6, 6, 8, 10, 11, 123, 123};
//		assertTrue(Arrays.equals(sorted, expected));
//	}
}
