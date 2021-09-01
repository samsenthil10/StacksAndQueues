package com.bridgelabz.stacksandqueues;

public class StacksAndQueues {

	public static void main(String[] args) {
		
		
		NodeImpl<Integer> item1 = new NodeImpl<>();
		NodeImpl<Integer> item2 = new NodeImpl<>();
		NodeImpl<Integer> item3 = new NodeImpl<>();
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
		myQueue.dequeue();
		myQueue.printMyQueue();
		System.out.println();
		myQueue.dequeue();
		myQueue.printMyQueue();
		System.out.println();
		myQueue.dequeue();
		myQueue.printMyQueue();
		System.out.println();
		myQueue.dequeue();
		myQueue.printMyQueue();
		System.out.println();
	}
}
