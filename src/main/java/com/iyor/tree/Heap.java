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
		int idx = findIndex(e);
		if (idx < 0) {
			return false;
		}
		data.set(idx, data.get(data.size()));
		data.set(data.size(), null);
		reposition(idx);
		return true;
	}

	public boolean contains(E e) {
		return data.contains(e);
	}

	private void reposition(int index) {
		int parentIdx = findParent(index);
		E parentElt = data.get(parentIdx);
		E childElt = data.get(index);
		if (childElt.compareTo(parentElt) < 0) {
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

	//Method is public solely for testing purposes
	public int findIndex(E elt) {
		for(int i = 0; i<data.size(); i++) {
			if (data.get(i).equals(elt)) {
				return i;
			}
		}
		return -1;
	}
}
