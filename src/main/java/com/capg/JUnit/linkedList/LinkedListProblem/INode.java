package com.capg.JUnit.linkedList.LinkedListProblem;

public interface INode<K> {

	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
}
