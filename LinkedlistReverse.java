import java.util.*;
class LinkedlistReverse{
	Node head;
	static class Node{
	int data;
	Node next;
	}
	public void insert(int data){
	Node newNode=new Node();
	newNode.data=data;
	newNode.next=head;
    head=newNode;
	}
	public static void main(String args[]){
		LinkedlistReverse l=new LinkedlistReverse();
		 l.insert(40);
         l.insert(30);
         l.insert(20);
         l.insert(10);
	}
}