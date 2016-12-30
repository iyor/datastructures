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

	public boolean add(E e){
		Node n = new Node(e);
		if(root==null){
			root = n;	
			return true;
		}
		return add(n, root);
	}

	private boolean add(Node n, Node localRoot) {
		int comp = n.compareTo(localRoot);
		if(comp>0){
			if(localRoot.right==null) {
				localRoot.right = n;
				return true;
			}
			return add(n, localRoot.right);
		}
		else if (comp<0) {
			if(localRoot.left==null) {
				localRoot.left = n;
				return true;
			}
			return add(n, localRoot.left);
		}
		else
			return false;
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
			if(localRoot.left!=null && localRoot.right!=null) {
				Node largestLeftChild = findLargestChild(localRoot.left);
				largestLeftChild.right = localRoot.right;
				largestLeftChild.left = localRoot.left; 
				return largestLeftChild;
			}	
			else if(localRoot.left==null) {
				return localRoot;	
			}
			else {
				return localRoot;	
			}
		}
	}

	private Node findLargestChild(Node n) {
		if(n.right==null)
			return n;
		if(n.right.right==null){
			Node largestChild = n.right;
			n.right = null;
			return largestChild;
		}
		return findLargestChild(n.right);
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
