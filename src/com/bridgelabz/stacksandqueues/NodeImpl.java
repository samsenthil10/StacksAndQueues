package com.bridgelabz.stacksandqueues;

public class Node<K> {

	private K key;
	private Node<K> next;

	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public Node<K> getNext() {
		return next;
	}
	public void setNext(Node<K> next) {
		this.next = next;
	}
}
