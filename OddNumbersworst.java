class OddNumbersworst{
	static void oddnumber(int[] arr){
		int count;
		for(int i=0;i<arr.length;i++){
			count=0;
		for (int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]){
				count++;
			}
		}
		if(count%2!=0){
			System.out.println(arr[i]);
		}
	}
	}
	public static void main(String args[]){
		int a[]={1,5,9,5,4,1,6,1,4,6};
		oddnumber(a);

	}
}