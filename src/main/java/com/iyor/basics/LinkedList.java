package com.iyor.basics;

public class LinkedList<E> {
	private class Node {
		
		protected E elt;

		protected Node next;

		Node(E elt){
			this.elt = elt;
			next = null;
		}

		@Override
		public boolean equals(Object o){
			return elt.equals(o);
		}
	}

	Node first, last;
	int size=0;

	public LinkedList(){
		first = last = null;	
	}

	public int size(){
		return size;	
	}

	public boolean add(E e){
		Node n = new Node(e);
		if(first==null){
			first = n;	
			last = n;
		}
		else{
			last.next = n;			
			last=last.next;
		}
		size++;
		return true;
	}

	public boolean remove(E e){
		Node current = first;
		if(current.equals(e)){
			first = first.next;
			size--;
			return true;
		}
		while(!current.next.equals(null)){
			if(current.next.equals(e)){
				if(current.next.equals(last))
					last=current;
				current.next = current.next.next;
				size--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public boolean contains(E e){
		if(size==0)
			return false;
		Node current = first;
		while(current!=null){
			if(current.equals(e))
				return true;
			current = current.next;
		}
		return false;
	}
}
