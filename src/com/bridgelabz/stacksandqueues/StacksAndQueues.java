package com.bridgelabz.stacksandqueues;

public class StacksAndQueues {

	public static void main(String[] args) {
		
		
		Node<Integer> item1 = new Node<>();
		Node<Integer> item2 = new Node<>();
		Node<Integer> item3 = new Node<>();
		item1.setKey(56);
		item2.setKey(30);
		item3.setKey(70);
		Queue<Integer> myQueue= new Queue<>();
		myQueue.enqueue(item1);
		myQueue.printMyQueue();
		System.out.println();
		myQueue.enqueue(item2);
		myQueue.printMyQueue();
		System.out.println();
		myQueue.enqueue(item3);
		myQueue.printMyQueue();
		System.out.println();
	}
}
