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

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
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

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
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
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
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

		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void whenPoppedLast_shouldDeleteTheLastElement() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.popLast();
		myLinkedList.printMyNodes();

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void whenSearchedAValue_shouldReturnTrue_ifPresent() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyNode<Integer> myForthNode = new MyNode(45);
		MyNode<Integer> myFifthNode = new MyNode(34);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myForthNode);
		myLinkedList.append(myFifthNode);
		myLinkedList.printMyNodes();

		boolean result = myLinkedList.search(30).equals(mySecondNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenANumber_whenAdded_shouldBeAddedAfterAMentionedElement() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		MyNode<Integer> myForthNode = new MyNode(40);

		MyLinkedList myLinkedList = new MyLinkedList();

		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insertAt(myForthNode, 30);

		myLinkedList.printMyNodes();

		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenANumber_whenRemoved_shouldBeDeletedFromList() {
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(40);
		MyNode<Integer> myForthNode = new MyNode(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myForthNode);
		myLinkedList.delete(40);
		
		myLinkedList.printMyNodes();
		System.out.println("Size after deletion : "+myLinkedList.sizeOfList());
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myForthNode);
		Assert.assertTrue(result);
		
	}
	@Test
	public void givenANumbers_WhenAddedToList_ShouldBeSorted() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		
		SortedLinkedList mySortedLinkedList = new SortedLinkedList();
		
		mySortedLinkedList.sortAndInsert (myFirstNode);
		mySortedLinkedList.sortAndInsert (mySecondNode);
		mySortedLinkedList.sortAndInsert(myThirdNode);
		mySortedLinkedList.sortAndInsert (myFourthNode);
		mySortedLinkedList.adjustTail();
		
		boolean result = mySortedLinkedList.head.equals(mySecondNode) &&  mySortedLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
		mySortedLinkedList.printMyNodes();
	}

}
