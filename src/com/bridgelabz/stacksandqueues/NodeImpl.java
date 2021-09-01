package com.bridgelabz.stacksandqueues;

public class NodeImpl<K> implements INodeIF<K>{

	private K key;
	private NodeImpl<K> next;


	@Override
	public K getKey() {
		return key;
	}
	@Override
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public NodeImpl<K> getNext() {
		return next;
	}
	@Override
	public void setNext(NodeImpl<K> next) {
		this.next = next;
	}
}