package com.iyor.basics;

import java.util.Arrays;

public class ArrayList<T> {
	
	private static final int INITIAL_CAPACITY = 10;
	private int capacity;
	private int size = 0;

	private T[] data;

	public ArrayList() {
		capacity = INITIAL_CAPACITY;
		data = (T[]) new Object[capacity];
	}
	
	public int size() {
		return size;	
	}

	public boolean add(T elt) {
		if ( size == capacity )	
			reallocate();
		data[size] = elt;
		size++;
		return true;
	}

	public boolean remove(int index) {
		if(index < 0 || index >= size) 
			return false;
		for(int i = index; i < size - 1; i++)
			data[i] = data[i + 1];
		data[size-1] = null;
		size--;
		return true;
	}

	public boolean contains(T elt) {
		for(T e : data)	
			if(elt.equals(e))
				return true;
		return false;
	}

	private void reallocate() {
		capacity = capacity * 2;
		data = Arrays.copyOf(data, capacity);
	}


}
