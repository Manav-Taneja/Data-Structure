class Swap{
   static void swaping(int arr1[]){
   int start=0;
   int end=arr1.length-1;
   while(start<end){
   int c=arr1[start];
   arr1[start]=arr1[end];
   arr1[end]=c;
   start++;
   end--;
   }
   for(int i=0;i<arr1.length;i++){
   	System.out.println(arr1[i]);
   }
   }
	public static void main(String args[]){
	int arr1[]={1,2,3,4,5};
	swaping(arr1);
	}
}