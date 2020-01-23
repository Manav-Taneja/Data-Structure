class Reverse{
	static void reverse(int arr1[],int arr2[]){
	for(int i=arr1.length-1;i>=0;i--){
	for(int j=0;j<arr1.length;j++){
	arr2[j]=arr1[i--];
	System.out.println(arr2[j]);
	}
	}
	}
	public static void main(String args[]){
		int arr1[]={1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		reverse(arr1,arr2);
	}
}