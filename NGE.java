import java.util.*;
class NGE{
	static void next(int arr[]){
		int top=0;
		Stack<Integer> st=new Stack<Integer>();
		st.push(arr[0]);
		for(int i=1;i<arr.length;i++){
			if((st.isEmpty())||(arr[i]<arr[top])){
				st.push(arr[i]);
				top++;
			}
			else{
				  int e=st.pop();
				  System.out.println(e);
				  arr[top]=0;
				  top--;
			}
		}
		for(int j=top;j>=0;j--){
			System.out.println("remaining in stack"+st.pop());
		}
	}	
		public static void main(String args[]){
         int arr[]={4,13,21,3};
         next(arr);
		}
	
}