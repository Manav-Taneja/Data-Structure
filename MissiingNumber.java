class MissiingNumber{
	static int missing(int arr[]){
    int min=arr[0];
	int max=arr[arr.length-1];
	int xor1=0;
	int xor2=0;
	for(int i=0;i<arr.length;i++){
		xor1=xor1^arr[i];
	}
	for(int j=1;j<=max;j++){
		xor2=xor2^j;
	}
	int missing=xor1^xor2;
	return missing;
	}
	public static void main(String args[]){
	int arr[]={1,2,3,4,5,6,7,8,9};
	System.out.println(missing(arr));
	}
}