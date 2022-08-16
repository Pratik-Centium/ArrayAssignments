package Assignment12;

public class SortArrayByParity {

	public static int [] sortArray(int [] nums)
	{
		int icnt=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
			{
				icnt++;
			}
		}
	
	
		int [] brr = new int[nums.length];
		
		int k=0;
		int l=icnt;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
			{
				
					brr[k]=nums[i];
					k++;
		
			}
			else
			{
				
					brr[l]=nums[i];
				    l++;
			}
		}
		
		return brr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,2,4,6,7,9};
		
		int [] brr=sortArray(arr);
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}

}
