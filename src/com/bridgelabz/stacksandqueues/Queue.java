package com.bridgelabz.stacksandqueues;

public class Queue<K> {

	LinkedList<K> linkedList = new LinkedList<>();

	public void enqueue(Node<K> node) {

		linkedList.append(node);
	}

	public void printMyQueue() {
		linkedList.printLinkedList();
	}
}
