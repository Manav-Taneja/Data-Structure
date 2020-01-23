import java.util.*;
class Linkedlistposition{
	public static void main(String args[]){
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(30);
		System.out.println(l);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Position");
		int position=sc.nextInt();
		ListIterator<Integer> li=l.listIterator();
		for(int i=0;i<l.size();i++){
		if(li.next()==key){
			System.out.println("Element found ");
			li.remove();
			System.out.println(l);
		}
		
	}
	}
}