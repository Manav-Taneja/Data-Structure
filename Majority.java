class Majority{
	static int find(int arr[]){
	int count=0;;
	for(int i=0;i<arr.length;i++){
	count=0;
	for(int j=0;j<arr.length;j++){
	if(arr[i]==arr[j]){
	count++;
	}
	}
	if(count>(arr.length/2)){
	return count;
	}
	}
	return arr[i];
}
	public static void main(String args[]){
		int arr[]={1,2,2,3,2,4,2,5,2,2};
		find(arr);
	}
}