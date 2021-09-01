package com.bridgelabz.stacksandqueues;

public class LinkedList<K> {

	private Node<K> head;
	private Node<K> tail;

	public Node<K> getHead() {
		return head;
	}
	public void setHead(Node<K> head) {
		this.head = head;
	}
	public Node<K> getTail() {
		return tail;
	}
	public void setTail(Node<K> tail) {
		this.tail = tail;
	}

	public void printLinkedList() {
		Node<K> temp = head;
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

	public void add(Node<K> node) {

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

	public void append(Node<K> node) {

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

	public void insertInBetween(Node<K> node, Node<K> previousNode, Node<K> nextNode) {
		Node<K> temp = head;
		while(temp != null) {
			if(temp == previousNode && temp.getNext() == nextNode) {
				break;
			}
			temp = temp.getNext();
		}
		if (temp != null) {
			Node<K> temp1 = temp.getNext();
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

			Node<K> temp = head;
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
			Node<K> temp = head;
			while(temp.getNext() != tail) {
				temp=temp.getNext();
			}
			tail = temp;
			tail.setNext(null);
		}
	}

	public Node<K> search(K key) {
		Node<K> temp = head;
		while(temp!=null) {
			if(temp.getKey().equals(key)) {
				break;
			}
			temp=temp.getNext();
		}
		return temp;
	}

	public void insertAfterKey(K searchKey, K newKey) {

		Node<K> temp = new Node<>();
		temp.setKey(newKey);
		Node<K> tempPrev = search(searchKey);
		Node<K> tempNext = tempPrev.getNext();
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
				Node<K> temp =head;
				head = temp.getNext();
				temp = null;
			}
		}
		else if(search(searchKey)!=null) {
			Node<K> tempPrevious = head;
			while(!tempPrevious.getNext().getKey().equals(searchKey))
				tempPrevious = tempPrevious.getNext();
			Node<K> temp = search(searchKey);
			Node<K> tempNext = temp.getNext();	
			temp = null;
			tempPrevious.setNext(tempNext);
		}
		else {
			System.out.println("Node Not Found");
		}
	}
	
	public int sizeOfList() {
		int counter=0;
		Node<K> temp = head;
		while(temp!=null) {
			counter++;
			temp=temp.getNext();
		}
		return counter;
	}
}
