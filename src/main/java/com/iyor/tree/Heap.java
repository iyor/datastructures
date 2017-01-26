package com.iyor.trees;

import java.lang.Comparable;
import com.iyor.basics.ArrayList;

public class Heap<E extends Comparable<E>> {
	ArrayList<E> data = new ArrayList<E>();

	public boolean add(E e) {
		data.add(e);
		int currentIdx = data.size() - 1;
		if (currentIdx > 1) {
			reposition(currentIdx);
		}
		return true;				
	}

	public boolean remove(E e) {
		return true;				
	}

	public boolean contains(E e) {
		return data.contains(e);
	}

	private void reposition(int index) {
		int parentIdx = findParent(index);
		E parentElt = data.get(findParent(index));
		E childElt = data.get(index);
		if (childElt.compareTo(parentElt)<0) {
			return;
		}
		data.set(parentIdx, childElt);
		data.set(index, parentElt);
		reposition(parentIdx);
	}

	private int findParent(int childIdx) {
		int parentIdx = (childIdx-1)/2;
		return parentIdx >= 0 ? parentIdx : 0;	
	}
}
