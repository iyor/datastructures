package com.iyor.basics;

public class Stack<E> {
	private class Node {
		protected E elt;

		protected Node next;

		Node(E elt){
			this.elt = elt;
			next = null;
		}
	}
	
	Node first;

	int size = 0;

	public Stack() {
		first=null;		
	}

	public E pop() {
		if(first==null)
			return null;
		E e = first.elt;
		first = first.next;
		return e;
	}

	public void push(E e) {
		Node n = new Node(e);
		n.next = first;
		first = n;
	}
}
