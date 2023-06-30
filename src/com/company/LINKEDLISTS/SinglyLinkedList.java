package com.company.LINKEDLISTS;

public class SinglyLinkedList {
	
    private Node head;
    private int size;
  
   
    public SinglyLinkedList() {
       this.size = 0;
       this.head = null;
    }
    
    public void insertNode(String data) {
    	Node node = new Node();
    	node.data = data;
    	
    	Node current = this.head;
    	
    	if(this.head == null) {
    		this.head = node;
    		this.head.next = null;
    		this.size = 1;
    	}
    	else {
    		while(current.next != null) {
    			current = current.next;
    		}
    		
    		current.next = node;
    		node.next = null;
    		this.size += 1;
    	}
    }
    
    public void addFirst(String data) {
    	Node node = new Node();
    	node.data = data;
    	
    	node.next = this.head;
    	this.head = node;
    	this.size++;
    }
    
    public void removeFirst() {
		if(head != null){
			this.head = this.head.next;
			this.size--;
		}
	}
    
    public void removeLast() {
		Node currentNode = this.head;
		if(size == 1){
			head = null;
			size = 0;
		}else{
			Node prevNode = null;
			while (currentNode.next != null) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = null;
			this.size--;
		}
	}


}


public class Node {
    public Object data;
    public Node next;

}
