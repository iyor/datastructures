package com.iyor.basics;


public class Queue<E> {
	private class Node {
		E elt;
		
		Node next; 

		Node(E e) {
			this.elt = e;	
		}
	}

	Node first, last;

	public Queue(){
		first = last = null;	
	}

	public void enqueue(E e){
		Node n = new Node(e);
		if(first==null){
			first = last = n;
			return;
		}
		last.next = n;
		last = n;
	}

	public E dequeue(){
		if(first==null)
			return null;
		E e = first.elt;
		first = first.next;
		return e;
	}
}
