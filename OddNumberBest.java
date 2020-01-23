class OddNumberBest{
	static int oddnumber(int arr[]){
	int i;
	int res=0;
    for(i=0;i<arr.length;i++){
    res=res^arr[i];
    }
    return res;
	}
	public static void main(String args[]){
	int arr[]={1,2,5,6,4,6,5,4,2,1,9};
	oddnumber(arr);
	}
}