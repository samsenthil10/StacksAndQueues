package com.bridgelabz.stacksandqueues;

public class Stack<K> {
	
	LinkedList<K> linkedList = new LinkedList<>();
	
	public void push(Node<K> node) {
		
		linkedList.add(node);
	}
	
	public void printMyStack() {
		linkedList.printLinkedList();
	}
	
	public K peak() {
		return linkedList.getHead().getKey();
	}
	
	public void pop() {
		linkedList.deleteAtFirst();
	}
	
	public void peakAndPopTillEmpty() {
		
		while(linkedList.sizeOfList()!=0) {
			System.out.println(peak());
			pop();
		}
	}
}
