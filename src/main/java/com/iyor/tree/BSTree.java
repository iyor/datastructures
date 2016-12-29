package com.iyor.trees;

import java.lang.Comparable;
import java.util.ArrayList;

public class BSTree<E extends Comparable<E>> {
	private class Node {
		E elt;

		Node left, right;

		public Node(E e){
			this.elt = e;
			left = right = null;
		}

		public int compareTo(Node n){
			return elt.compareTo(n.elt);
		}
	}	

	Node root;

	public BSTree(){
		this.root = null;
		this.size = 0;
	}

	public boolean add(E e){
		Node n = new Node(e);
		if(root==null){
			root = n;	
			return true;
		}
		Node leaf = find(n, root);	
		int comp = n.compareTo(leaf);
		if(comp==0) return false;
		else if(comp<0) leaf.left = n;     
		else if (comp>0) leaf.right = n;
		return true;
	}

	public boolean remove(E e){
		//TODO finish method
		return false;
	} 

	public boolean contains(E e){
		Node n = new Node(e);
		if(root==null){
			return false;
		}
		Node candidate = find(n, root);
		int comp = n.compareTo(candidate);
		if(comp==0) return true;
		return false;
	}

	private Node find(Node n, Node localRoot){
		int comp = n.compareTo(localRoot);
		if(comp<0){
			if(localRoot.left==null) return localRoot;
			return find(n, localRoot.left);	
		}
		else if(comp>0){
			if(localRoot.right==null) return localRoot;
			return find(n, localRoot.right);
		}
		else {
			return localRoot;			
		}
	}

	public ArrayList<E> traversePreOrder(){
		ArrayList<E> preOrderElts = new ArrayList<E>();
		traversePreOrder(root, preOrderElts);
		return preOrderElts;
	}

	private void traversePreOrder(Node n, ArrayList<E> elts){
		if(n==null) return;
		elts.add(n.elt);
		traversePreOrder(n.left, elts);
		traversePreOrder(n.right, elts);
	}

}
