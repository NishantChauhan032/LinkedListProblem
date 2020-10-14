package com.capg.JUnit.linkedList.LinkedListProblem;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest{
	
	@Test
	public void givenThreeNumbers_whenLinked_shouldPassLinkedListTest() {
	 MyNode<Integer> myFirstNode = new MyNode(56);
	 MyNode<Integer> mySecondNode = new MyNode(30);
	 MyNode<Integer> myThirdNode = new MyNode(70);
	 
	 myFirstNode.setNext(mySecondNode);
	 mySecondNode.setNext(myThirdNode);
	 
	 boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
	 Assert.assertTrue(result);
	}
	
}