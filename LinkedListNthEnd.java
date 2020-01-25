class LinkedListNthEnd{
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
	
		public void nthEnd(int index){
			Node temp1=head;
		int count=1;
		while(temp1.next!=null){
			temp1=temp1.next;
			count++;
		}
		// System.out.println(count);
		Node temp=head;
		for(int i=0;i<count-index;i++){
          temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public void print(){
		Node temp=head;
		for(int i=0;i<5;i++){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[]){
		LinkedListNthEnd l=new LinkedListNthEnd();
		l.insert(50);
		l.insert(40);
		l.insert(30);
		l.insert(20);
		l.insert(10);
		l.print();
		l.nthEnd(4);
	}
}