import java.util.*;
class ReverseStack{
/*	static void reverse(Stack s1){
		Stack<Integer> s2=new Stack<Integer>();
		System.out.println("Reverse Stack is ");
       for(int i=0;i<s1.size();i++){
       	
	   s2.push(Integer(s1.pop()));
	   System.out.println(s2);
	}
}*/
	public static void main(String args[]){
	Stack<Integer> s1=new Stack<Integer>();
	s1.push(1);
	s1.push(2);
	s1.push(3);
	s1.push(4);
	s1.push(5);
	System.out.println("Given Stack is "+s1);
	Stack<Integer> s2=new Stack<Integer>();
		System.out.println("Reverse Stack is ");
         while(!s1.isEmpty())
         {
         	s2.push(s1.pop());
         }
	   System.out.println(s2);
	   System.out.println(s2.firstElement());
	}
}