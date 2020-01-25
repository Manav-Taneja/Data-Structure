class LinkedListInsertion{
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
	public void insertatlast(int data){
		Node newNode=new Node();
		newNode.data=data;
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=null;
	}
	public void inseratmid(int position,int data){
		Node temp=head;
		Node newNode =new Node();
		newNode.data=data;
		for(int i=0;i<position-1;i++){
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void delete(){
		Node temp=head;
		head=temp.next;
		temp.next=null;
	}
	public void deletelast(){
		Node temp=head;
		Node prev=null;
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;

	}
	public void deleteposition(int position){
		Node temp=head;
		Node prev=null;
		for(int i=0;i<position;i++){
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		temp.next=null;
	}
	public void print(){
		Node temp=head;
		while(temp!=null){
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		LinkedListInsertion l=new LinkedListInsertion();
   l.insert(40);
   l.insert(30);
   l.insert(20);
    l.insert(10);
    //l.insertatlast(50);
    l.inseratmid(2,25);
   //l.delete();
   // l.deletelast();
   // l.deleteposition(2);
    l.print();

	}
}