package com.iyor.sort;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

	@Test
	public void singleElementTest() {
		Integer[] arr = {2};	
		QuickSort.sort(arr);
		Integer[] expected = {2};
		assertTrue(Arrays.equals(arr, expected));
	}

	@Test
	public void simpleSortTest() {
		Integer[] arr = {3,2};	
		QuickSort.sort(arr);
		Integer[] expected = {2,3};
		assertTrue(Arrays.equals(arr, expected));
	}

	@Test
	public void oddLengthArrayTest() {
		Integer[] arr = {3,2,6};	
		QuickSort.sort(arr);
		Integer[] expected = {2,3,6};
		assertTrue(Arrays.equals(arr, expected));
	}

	@Test
	public void mergeSortTest() {
		Integer[] arr = {3,2,6,8,4,6,5,3,10,3,11,-2,123,123};	
		QuickSort.sort(arr);
		Integer[] expected = {-2, 2, 3, 3, 3, 4, 5, 6, 6, 8, 10, 11, 123, 123};
		assertTrue(Arrays.equals(arr, expected));
	}
}
