import java.util.*;
class StackBalance{
	static boolean balance(char character1,char character2){
		if((character1=='(')&&(character2==')')){
			return true;
		}
		else if((character1=='{')&&(character2=='}')){
			return true;
		}
		else if((character1=='[')&&(character2==']')){
			return true;
		}
		else{
			return false;
		}
	}
	static boolean check(char arr[]){
    Stack<Character> st=new Stack<Character>();
    for(int i=0;i<arr.length;i++){
    	if(arr[i]=='{'||arr[i]=='['||arr[i]=='('){
    		st.push(arr[i]);
    	}
    	else if(arr[i]=='}'||arr[i]==']'||arr[i]==')'){
    		if(balance(st.peek(),arr[i])){
    			return true;
    		}
    	}
    }
    	if(st.isEmpty()){
    		return true;
    	}
    	else{
    		return false;
    	}
	}
	public static void main(String args[]){
		char arr[]={'{','(',')','}','[','}'};
		if(check(arr)){
			System.out.println("paranthesis are Balanced");
		}
		else{
			System.out.println("paranthesis are not Balanced");
		}

}
}