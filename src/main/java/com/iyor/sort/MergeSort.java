package com.iyor.sort;

import java.lang.reflect.Array;

public class MergeSort {

	public static <T extends Comparable<? super T>> T[]  sort(T[] arr){
		if(arr.length==1)
			return arr;
		boolean oddLength = arr.length%2!=0;
		int lengthL = arr.length/2;
		int lengthR = lengthL + (oddLength?1:0);

		T[] l = (T[]) Array.newInstance(arr.getClass().getComponentType(), lengthL);
		T[] r = (T[]) Array.newInstance(arr.getClass().getComponentType(), lengthR);

		for(int i=0; i < lengthL; i++){
			l[i] = arr[i];
			r[i] = arr[lengthL + i];
		}
		if(oddLength)
			r[lengthR-1]=arr[arr.length-1];
		return merge(sort(l), sort(r));
	}

	private static <T extends Comparable<? super T>> T[] merge(T[] a, T[] b){
		T[] out = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);
		int aIndex = 0;
		int bIndex = 0;
		int outIndex = 0;

		while(aIndex<a.length && bIndex<b.length){
			if(a[aIndex].compareTo(b[bIndex])<0){
				out[outIndex] = a[aIndex];
				aIndex++;
			}
			else{
				out[outIndex] = b[bIndex];
				bIndex++;
			}
			outIndex++;
		}
		if(aIndex<a.length){
			for(int i=aIndex; i<a.length; i++){
				out[outIndex] = a[i];
				outIndex++;
			}
		}
		else if (bIndex<b.length){
			for(int i=bIndex; i<b.length; i++){
				out[outIndex] = b[i];
				outIndex++;
			}
		}

		return out;	
	}
}
