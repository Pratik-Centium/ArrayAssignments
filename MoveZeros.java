package Assignment12;

public class MoveZeros {
	 public static void moveZeroes(int[] nums) {
		 int icnt=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==0)
	            {
	                for(int j=i;j<nums.length-1;j++)
	                {
	                    nums[j]=nums[j+1];
	                }
	                
	                icnt++;
	            }
	        }
	        
	       int m=nums.length-icnt;
	       
	      
	        for(int i=m;i<nums.length;i++)
	        {
	            nums[i]=0;
	        }
	        System.out.print("Array is :{ ");
	        for(int i=0;i<nums.length;i++)
	        {
	        	System.out.print(nums[i]+" ");
	        }
	        System.out.println("}"); 
	 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int [] arr={2,4,0,8,0,7,0,6};
		moveZeroes(arr);
        
        
	}

}
