package com.iyor.trees;

import java.lang.Comparable;
import com.iyor.basics.ArrayList;

public class Heap<E extends Comparable<E>> {
	ArrayList<E> data = new ArrayList<E>();

	public boolean add(E e) {
		data.add(e);
		int currentIdx = data.size();
		reposition(currentIdx);
		return true;				
	}

	public boolean remove(E e) {
		return true;				
	}

	public boolean contains(E e) {
		return true;				
	}

	private void reposition(int index) {
		int parent = findParent(index);
		if (data.get(index).compareTo(data.get(parent))>0) {
			return;
		}
		E temp = data.get(parent);
		data.set(parent, data.get(index));
		data.set(index, temp);
		reposition(parent);
	}

	private int findParent(int childIdx) {
		return (childIdx-1)/2;	
	}
}
