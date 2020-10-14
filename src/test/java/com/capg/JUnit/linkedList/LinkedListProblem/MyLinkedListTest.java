package com.capg.JUnit.linkedList.LinkedListProblem;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void givenThreeNumbers_whenAddedToLinkedList_shouldBeAddedToTop() {
		 MyNode<Integer> myFirstNode = new MyNode(70);
		 MyNode<Integer> mySecondNode = new MyNode(30);
		 MyNode<Integer> myThirdNode = new MyNode(56);
		 
		 MyLinkedList myLinkedList = new MyLinkedList();
		 
		 myLinkedList.add(myFirstNode);
		 myLinkedList.add(mySecondNode);
		 myLinkedList.add(myThirdNode);
		 myLinkedList.printMyNodes();
		 
		 boolean result = myLinkedList.head.equals(myThirdNode)&&
				          myLinkedList.head.getNext().equals(mySecondNode)&&
				          myLinkedList.tail.equals(myFirstNode);
				          Assert.assertTrue(result);
	}
	@Test
	public void givenThreeNumbers_whenAddedToLinkedList_shouldBeAddedToLast() {
		 MyNode<Integer> myFirstNode = new MyNode(56);
		 MyNode<Integer> mySecondNode = new MyNode(30);
		 MyNode<Integer> myThirdNode = new MyNode(70);
		 
		 MyLinkedList myLinkedList = new MyLinkedList();
		 
		 myLinkedList.append(myFirstNode);
		 myLinkedList.append(mySecondNode);
		 myLinkedList.append(myThirdNode);
		 myLinkedList.printMyNodes();
		 
		 boolean result = myLinkedList.head.equals(myFirstNode)&&
				          myLinkedList.head.getNext().equals(mySecondNode)&&
				          myLinkedList.tail.equals(myThirdNode);
				          Assert.assertTrue(result);
	}
	@Test
	public void givenANumber_whenAddedToLinkedList_shouldBeAddedBetweenTwoNumbers() {
		 MyNode<Integer> myFirstNode = new MyNode(56);
		 MyNode<Integer> mySecondNode = new MyNode(30);
		 MyNode<Integer> myThirdNode = new MyNode(70);
		 
		 MyLinkedList myLinkedList = new MyLinkedList();
		 
		 myLinkedList.append(myFirstNode);
		 myLinkedList.append(myThirdNode);
		 myLinkedList.insert(myFirstNode,mySecondNode);
		 myLinkedList.printMyNodes();
		 
		 boolean result = myLinkedList.head.equals(myFirstNode)&&
				          myLinkedList.head.getNext().equals(mySecondNode)&&
				          myLinkedList.tail.equals(myThirdNode);
				          Assert.assertTrue(result);
	}
	@Test
	public void whenPopped_shouldDeleteTheFirstElement() {
		 MyNode<Integer> myFirstNode = new MyNode(56);
		 MyNode<Integer> mySecondNode = new MyNode(30);
		 MyNode<Integer> myThirdNode = new MyNode(70);
		 
		 MyLinkedList myLinkedList = new MyLinkedList();
		 
		 myLinkedList.append(myFirstNode);
		 myLinkedList.append(mySecondNode);
		 myLinkedList.append(myThirdNode);
		 myLinkedList.pop();
		 myLinkedList.printMyNodes();
		 
		 boolean result = myLinkedList.head.equals(mySecondNode)&&
				          myLinkedList.tail.equals(myThirdNode);
				          Assert.assertTrue(result);
	}
}
