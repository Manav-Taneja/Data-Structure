class LinkedListNth{
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
	public void nth(int index){
		Node temp=head;
		for(int i=0;i<index-1;i++){
          temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String args[]){
		LinkedListNth l=new LinkedListNth();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.nth(4);
	}
}