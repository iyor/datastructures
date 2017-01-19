package com.iyor.sort;

public class QuickSort {

	public static <T extends Comparable<? super T>> void sort(T[] arr) {
		sort(arr, 0, arr.length-1);
	}

	private static <T extends Comparable<? super T>> void sort(T[] arr, int low, int high) {
		if(low >= high) // base case
			return;
		int middle = (low + high)/2;
		swap(arr, middle, high);
		int pivotIdx = high;
		middle = partition(arr, low, high, pivotIdx);
		swap(arr, middle, high); // Return the pivot index to it's proper place
		sort(arr, low, middle-1);
		sort(arr, middle + 1, high);
	}

	private static <T extends Comparable<? super T>> int partition(T[] arr, int low, int high, int pivotIdx) {
		while(low < high) {
			while(low < high && arr[low].compareTo(arr[pivotIdx])<0) {
				low++;	
			}
			while(low < high && arr[high].compareTo(arr[pivotIdx])>=0) {
				high--;	
			}
			if(low < high)
				swap(arr, low, high);
		}	
		return low;
	}

	private static <T extends Comparable<? super T>> void swap(T[] arr, int idx1, int idx2) {
		T temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
}
