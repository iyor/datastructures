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
	}

	public void add(E e){
		Node n = new Node(e);
		if(root==null){
			root = n;	
			return;
		}
		add(n, root);
	}

	private void add(Node n, Node localRoot) {
		int comp = n.compareTo(localRoot);
		if(comp>0){
			if(localRoot.right==null) {
				localRoot.right = n;
				return;
			}
			add(n, localRoot.right);
		}
		else if (comp<0) {
			if(localRoot.left==null) {
				localRoot.left = n;
				return;
			}
			add(n, localRoot.left);
		}
		else
			return;
	}

	public void remove(E e) {
		if(root==null){
			return;
		}
		Node n = new Node(e);
		this.root = remove(n, root);
	} 

	private Node remove(Node n, Node localRoot) {
		if (localRoot == null){
			return localRoot;
		}	
		int comp = n.compareTo(localRoot);
		if(comp>0){
			localRoot.right = remove(n, localRoot.right);
			return localRoot;	
		}
		else if (comp<0) {
			localRoot.left = remove(n, localRoot.left);
			return localRoot;
		}
		else {
			if(localRoot.left==null)
				return localRoot.right;
			else if (localRoot.right==null)
				return localRoot.left;
			else {
				if(localRoot.left.right==null) {
					localRoot.elt = localRoot.left.elt;
					localRoot.left=localRoot.left.left;
					return localRoot;
				}
				else {
					Node largestLeftChild = retrieveLargestChild(localRoot.left);
					largestLeftChild.left = localRoot.left;
					largestLeftChild.right = localRoot.right;
					localRoot = largestLeftChild;
					return localRoot;
				}
			}
		}
	}

	private Node retrieveLargestChild(Node n) {
		if(n.right.right==null){
			Node largestChild = n.right;
			n.right = n.right.left;
			return largestChild;
		}
		return retrieveLargestChild(n.right);
	}

	public boolean contains(E e) {
		Node n = new Node(e);
		if(root==null){
			return false;
		}
		return contains(n, root);
	}

	private boolean contains(Node n, Node localRoot) {
		int comp = n.compareTo(localRoot);
		if(comp>0){
			if(localRoot.right==null) {
				return false;
			}
			return contains(n, localRoot.right);
		}
		else if (comp<0) {
			if(localRoot.left==null) {
				return false;
			}
			return contains(n, localRoot.left);
		}
		else
			return true;
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
