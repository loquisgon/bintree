package com.dlogik.tree;

import java.util.ArrayList;
import java.util.List;

class Node<T extends Comparable<T>> {
	private Node<T> left;
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	private Node<T> right;
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	private T data;
	public T getData() {
		return data;
	}
	public Node(T value) {
		data = value;
	}
	
}

public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;
	
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(T value) {
		root = new Node<T>(value);
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public BinaryTree<T> insert(T value) {
		if (isEmpty()) {
			root = new Node<T>(value);
		}
		insert(root,value);
		return this;
	}
	private void insert(Node<T> current, T value) {
		
		if (value.compareTo(current.getData()) < 0) {
			if (current.getLeft() != null) {
				insert(current.getLeft(),value);
			}
			else {
				current.setLeft(new Node<T>(value));
			}
		} else if (value.compareTo(current.getData()) == 0) {
			return;
		} else {
			if (current.getRight() != null) {
				insert(current.getRight(),value);
			}
			else {
				current.setRight(new Node<T>(value));
			}
		}
	}
	
	
	
	public List<T> preOrder() {
		List<T> list = new ArrayList<T>();
		visitPreOrder(list,root);
		return list;
	}
	
	private void visitPreOrder(List<T> list, Node<T> current) {
		if (current == null) {
			return;
		}
		list.add(current.getData());
		visitPreOrder(list,current.getLeft());
		visitPreOrder(list,current.getRight());
	}
	
	
	public boolean find(T value) {
		return find(root, value);
	}
	
	private boolean find(Node<T> current, T value) {
		boolean retVal = false;
		if (current == null){
			return false;
		}
		if (current.getData().compareTo(value) == 0) {
			return true;
		}
		if (current.getLeft() != null) {
			retVal = find(current.getLeft(),value);
		}

		if (!retVal && current.getRight() != null) {
				retVal = find(current.getRight(),value);
		}
		
		return retVal;
	}
	
	
	
		
}
