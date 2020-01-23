class Insertion{
	static void insert(int arr[]){
	for(int i=0;i<arr.length;i++){
	if(arr[i]>arr[i+1]){
    temp=arr[i];
    arr[i]=arr[i++];
    arr[i++]=arr[i];
	}
	}
	for(i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	}
	public static void main(String args[]){
		int arr[]={5,8,2,7,6};
		insert(arr);
	}
}