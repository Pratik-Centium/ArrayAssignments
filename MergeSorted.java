package Assignment12;

public class MergeSorted {
	public static int[] insertionSort(int arr[], int n) 
	{ 
	    int i, key, j; 
	    for (i = 1; i < n; i++)
	    { 
	        key = arr[i]; 
	        j = i - 1; 
	  
	        // Move elements of arr[0..i-1],  
	        // that are greater than key, to one 
	        // position ahead of their 
	        // current position
	        while (j >= 0 && arr[j] > key)
	        { 
	            arr[j + 1] = arr[j]; 
	            j = j - 1; 
	        } 
	        arr[j + 1] = key; 
	    } 
	    
	    return arr;
	} 

	public static int[] m1(int [] arr)
	{
		
		int [] brr = new int[arr.length];
		
		for(int i=0,j=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				brr[j]=arr[i];
				j++;
			}
		}

		int icnt=0;
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]!=0)
			{
				icnt++;
			}
			
		}
		
		int [] crr = new int[icnt];
		
		for(int i=0;i<crr.length;i++)
		{
			crr[i]=brr[i];
		}
		
		return crr;
		
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
    	int [] crr=m1(nums1);
		int [] crr1=m1(nums2);
		
		int k=crr.length+crr1.length;
		
		int [] arr = new int[k];
		
		for(int i=0;i<crr.length;i++)
		{
			arr[i]=crr[i];
		}
		
		for(int i=crr.length,j=0;i<arr.length&& j<crr1.length;i++)
		{
			
			arr[i]=crr1[j];
			j++;
		}
		

		
		int [] mrr=insertionSort(arr,arr.length);
		
		System.out.print("final output is : { ");
		
		for(int i=0;i<mrr.length;i++)
		{
			System.out.print(mrr[i]+" ");
		}
		System.out.print("}");
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums1= {1,2,3,0,0,0};
		int [] nums2= {2,5,6};
		
		merge(nums1,nums1.length,nums2,nums2.length);
		
		

	}

}
