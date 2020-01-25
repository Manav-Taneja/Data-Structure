import java.util.*;
class LinkedListFunction{
	public static void main(String args[]){
	LinkedList<Integer> l=new LinkedList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	delete(l);
	System.out.println(l);
	}
	/*static void delete(LinkedList<Integer> l){
		ListIterator<Integer> li=l.listIterator();
		System.out.println(l.size());
		for(int i=0;i<=l.size();i++){
			li.next();
            li.remove();
		}
	}*/
	static void delete(LinkedList<Integer> l){
		ListIterator<Integer> li=l.listIterator();
		while(li.hasNext()){
			l.remove();
		}
	}
}