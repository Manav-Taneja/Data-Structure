import java.util.*;
class StackString{
	static String insert(String s){
	Stack<Character> st=new Stack<Character>();
	String reveresedString = "";
	for(int i=0;i<s.length();i++){
    st.push(s.charAt(i));
	}
	while(!st.isEmpty()){
		reveresedString=reveresedString+st.pop();
	}
	return reveresedString;
	}
	public static void main(String args[]){
    System.out.println(insert("divyataneja"));
	}
}