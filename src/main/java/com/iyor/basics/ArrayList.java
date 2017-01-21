package com.iyor.basics;

import java.util.Arrays;

public class ArrayList<E> {
	
	private static final int INITIAL_CAPACITY = 10;
	private int capacity;
	private int size = 0;

	private E[] data;

	public ArrayList() {
		capacity = INITIAL_CAPACITY;
		data = (E[]) new Object[capacity];
	}
	
	public int size() {
		return size;	
	}

	public boolean add(E elt) {
		if (size == capacity)	
			reallocate();
		data[size] = elt;
		size++;
		return true;
	}

	public boolean remove(int index) {
		if (index < 0 || index >= size) 
			return false;
		for (int i = index; i < size - 1; i++)
			data[i] = data[i + 1];
		data[size-1] = null;
		size--;
		return true;
	}

	public boolean contains(E elt) {
		for(E e : data)	
			if(elt.equals(e))
				return true;
		return false;
	}

	private void reallocate() {
		capacity = capacity * 2;
		data = Arrays.copyOf(data, capacity);
	}

	public E get(int index) {
		if (index > size-1)
			return null;
		return data[index];
	}
	
	public E set(int index, E elt) {
		if (index > size-1)	
			return null;
		data[index] = elt;
		return data[index];
	}
}
