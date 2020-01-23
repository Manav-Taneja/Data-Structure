class Searching
{
	static int pivot(int arr[])
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{
            continue;
		     }
		    else{
			System.out.println(i);
			break;
		     }
	    }
	    return i;
    }
    static void search(int arr[],int n){
    	int mid=pivot(arr);
    	int start=0;
    	int end=arr.length-1;
    	if(arr[mid]==n){
    		System.out.println("found");
    	}
    	else{
    		if(n<arr[mid]){
    			end=mid-1;
    		}
    		else{
    			start=mid+1;
    		}
    	}

    }
	public static void main(String args[]){
	int arr[]={3,4,5,1,2};
    pivot(arr);
    int n=5;
	}
}