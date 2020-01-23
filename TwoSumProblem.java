import java.util.*;
class TwoSumProblem{
    static void sum(int arr[],int sum){
    HashSet<Integer> h= new HashSet<Integer>();
    for(int i=0;i<arr.length;++i){
    	int temp=sum-arr[i];
    	if(h.contains(temp)){
    		System.out.println("Sum found pair is :"+"("+arr[i]+","+temp+")");
    	}
    	h.add(arr[i]);
    }
    }
	public static void main(String args[]){
	int arr[]={1,2,10,6,8,4};
	int n=16;
	sum(arr,n);
	}
}