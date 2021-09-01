package com.bridgelabz.stacksandqueues;

public class LinkedList<K> {

	private NodeImpl<K> head;
	private NodeImpl<K> tail;

	public NodeImpl<K> getHead() {
		return head;
	}
	public void setHead(NodeImpl<K> head) {
		this.head = head;
	}
	public NodeImpl<K> getTail() {
		return tail;
	}
	public void setTail(NodeImpl<K> tail) {
		this.tail = tail;
	}

	public void printLinkedList() {
		NodeImpl<K> temp = head;
		while(temp != null) {
			if(temp.getNext()!= null) {
				System.out.print(temp.getKey()+"->");
				temp = temp.getNext();
			}
			else {
				System.out.println(temp.getKey());
				temp = temp.getNext();
			}
		}
	}

	public void add(NodeImpl<K> node) {

		if(head == null) {
			head = node;
			tail = node;
			tail.setNext(null);
		}
		else {
			node.setNext(head);
			head = node;
		}
	}

	public void append(NodeImpl<K> node) {

		if(head == null) {
			head = node;
			tail = node;
		}
		else{
			tail.setNext(node);
			tail = node;
			tail.setNext(null);
		}
	}

	public void insertInBetween(NodeImpl<K> node, NodeImpl<K> previousNode, NodeImpl<K> nextNode) {
		NodeImpl<K> temp = head;
		while(temp != null) {
			if(temp == previousNode && temp.getNext() == nextNode) {
				break;
			}
			temp = temp.getNext();
		}
		if (temp != null) {
			NodeImpl<K> temp1 = temp.getNext();
			temp.setNext(node);
			node.setNext(temp1);
		}
		else {
			System.out.println("Nodes Not Found!");
		}
	}

	public void deleteAtFirst() {
		if(head == null) {
			System.out.println("Empty!");
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {

			NodeImpl<K> temp = head;
			head = temp.getNext();
			temp = null;
		}
	}

	public void deleteAtLast() {
		if(head == null) {
			System.out.println("Empty!");
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {
			NodeImpl<K> temp = head;
			while(temp.getNext() != tail) {
				temp=temp.getNext();
			}
			tail = temp;
			tail.setNext(null);
		}
	}

	public NodeImpl<K> search(K key) {
		NodeImpl<K> temp = head;
		while(temp!=null) {
			if(temp.getKey().equals(key)) {
				break;
			}
			temp=temp.getNext();
		}
		return temp;
	}

	public void insertAfterKey(K searchKey, K newKey) {

		NodeImpl<K> temp = new NodeImpl<>();
		temp.setKey(newKey);
		NodeImpl<K> tempPrev = search(searchKey);
		NodeImpl<K> tempNext = tempPrev.getNext();
		tempPrev.setNext(temp);
		temp.setNext(tempNext);
	}

	public void deleteNodeWithKey(K searchKey) {

		if(head == null) {
			System.out.println("Empty!");
			return;
		}
		else if((head.getKey().equals(searchKey)))
		{
			if(head.getNext()==null) {
				head = tail = null;
			}
			else {
				NodeImpl<K> temp =head;
				head = temp.getNext();
				temp = null;
			}
		}
		else if(search(searchKey)!=null) {
			NodeImpl<K> tempPrevious = head;
			while(!tempPrevious.getNext().getKey().equals(searchKey))
				tempPrevious = tempPrevious.getNext();
			NodeImpl<K> temp = search(searchKey);
			NodeImpl<K> tempNext = temp.getNext();	
			temp = null;
			tempPrevious.setNext(tempNext);
		}
		else {
			System.out.println("Node Not Found");
		}
	}
	
	public int sizeOfList() {
		int counter=0;
		NodeImpl<K> temp = head;
		while(temp!=null) {
			counter++;
			temp=temp.getNext();
		}
		return counter;
	}
}
