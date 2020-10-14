package com.capg.JUnit.linkedList.LinkedListProblem;

public class MyLinkedList {

	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		}else {
			newNode.setNext(head);
			this.head=newNode;
		}
	}
		public void append(INode newNode) {
			if (this.tail == null) {
				this.tail = newNode;
			}
			if (this.head == null) {
				this.head = newNode;
			}else {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
	}
		
		public void insert(INode myNode,INode newNode) {
			INode tempNode = myNode.getNext();
			myNode.setNext(newNode);
			newNode.setNext(tempNode);
		}
		
		public INode pop() {
			INode tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}
		
		public INode popLast() {
			INode tempNode = head;
			while(!tempNode.getNext().equals(tail)) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
			return tempNode;
		}
		
	public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while(tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
