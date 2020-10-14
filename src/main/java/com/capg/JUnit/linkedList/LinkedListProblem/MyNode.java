package com.capg.JUnit.linkedList.LinkedListProblem;

public class MyNode<K> {
	private K key;
	private MyNode next;

	public MyNode(K key) {
		super();
		this.key = key;
		this.next = null;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

}
