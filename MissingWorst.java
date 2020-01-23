class MissingWorst{
	static int missing(int arr[]){
	int max=arr[arr.length-1];
	int sum1=0;
	int sum2=0;
	for(int i=0;i<arr.length;i++){
	sum1=sum1+arr[i];
	}
	for(int j=1;j<=max;j++){
	sum2=sum2+j;
	}
	int missing=sum2-sum1;
	return missing;
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,6,7,8,9};
		System.out.println(missing(arr));
	}
}