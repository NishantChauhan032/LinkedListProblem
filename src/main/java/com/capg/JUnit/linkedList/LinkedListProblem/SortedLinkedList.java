package com.capg.JUnit.linkedList.LinkedListProblem;

public class SortedLinkedList {

	public INode head;
	public INode tail;

	public SortedLinkedList() {
		this.head = null;

	}

	public <K extends Comparable<K>> void sortAndInsert(INode newNode) {
		INode currentNode = this.head;
		INode previousNode = null;
		while (currentNode != null && (((Comparable<K>) newNode.getKey()).compareTo((K) currentNode.getKey()) > 0)) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		if (previousNode == null) {
			this.head = newNode;
		} else {
			previousNode.setNext(newNode);
		}
		newNode.setNext(currentNode);
	}

	public void adjustTail() {
		INode tempNode = this.head;
		while (!(tempNode == null)) {
			this.tail = tempNode;
			tempNode = tempNode.getNext();
		}
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
