package com.bridgelabz.stacksandqueues;

public interface INodeIF<K> {
	
	public K getKey();
	public void setKey(K key);
	public NodeImpl<K> getNext();
	public void setNext(NodeImpl<K> next);
}
