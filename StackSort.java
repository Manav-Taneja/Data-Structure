import java.util.*;
class StackSort{
	public static void main(String args[]){
	Stack<Integer> s1=new Stack<Integer>();
     s1.push(10);
     s1.push(20);
     s1.push(50);
     s1.push(30);
     s1.push(40);
     System.out.println("Given Stack is "+s1);                                                 
	 if(s1.firstElement()>s1.peek()){
	 	System.out.println(s1.firstElement());
	 }
	 else{
	 	System.out.println(s1.peek());
	 }
	}
}