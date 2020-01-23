class Merge{
	static void merge(int arr1[],int arr2[],int m,int n){
	int i=0;
	int j=0;
	int k=0;
	int[] arr3=new int[arr1.length+arr2.length];
	while(i<=m&&j<=n){
    if(arr1[i]<arr2[j]){
    arr3[k++]=arr1[i++];
    }
    else{
    arr3[k++]=arr2[j++];
    }
    }
    for(;i<=m;i++){
    arr3[k++]=arr1[i];
    }
    for(;j<=n;j++){
    arr3[k++]=arr2[j];
    }
    for(int x=0;x<arr3.length;x++){
    	System.out.println(arr3[x]);
    }
	}
	public static void main(String args[]){
	int arr1[]={1,2,3,40,56};
	int arr2[]={7,8,49,65,90};
	int m=arr1.length-1;
	int n=arr2.length-1;
    merge(arr1,arr2,m,n);
	}
}