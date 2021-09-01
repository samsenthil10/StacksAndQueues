package com.bridgelabz.stacksandqueues;

public class StacksAndQueues {

	public static void main(String[] args) {
		
		
		Node<Integer> item1 = new Node<>();
		Node<Integer> item2 = new Node<>();
		Node<Integer> item3 = new Node<>();
		item1.setKey(70);
		item2.setKey(30);
		item3.setKey(56);
		Stack<Integer> myStack= new Stack<>();
		myStack.push(item1);
		myStack.printMyStack();
		System.out.println(myStack.peak());
		System.out.println();
		myStack.push(item2);
		myStack.printMyStack();
		System.out.println(myStack.peak());
		System.out.println();
		myStack.push(item3);
		myStack.printMyStack();
		System.out.println(myStack.peak());	
	}
}
