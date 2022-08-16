package Assignment12;

public class RemoveDuplicate1 {

	public static int [] SortingX(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{

			int temp=0;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		
			
		}
		
		return arr;
		
	}
	
	public static int LengthOfArrayX(int [] arr)
	{
		int length=arr.length;
		for(int i=(length)-2;i>=0;i--)
		{
			if(arr[i]==arr[i+1])
			{
				for(int j=i+1;j<length;j++)
				{
					arr[j-1]=arr[j];
					
				}
				
				length--;
				
			}
			
			
		}
		

		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {3,6,2,5,7,2,3,2};
		
		SortingX(arr);
		
		int length=LengthOfArrayX(arr);
//		System.out.println(length);
		int [] brr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
           
           if(i>=length)
           {
        	   brr[i]=0;
        	   
           }
           else
           {
        	   brr[i]=arr[i];
           }
        
		}
		System.out.print("Array is : ");
		
		String [] str = new String[brr.length];
		
		for(int i=0;i<brr.length;i++)
		{
			 if(i>=length)
	           {
	        	   str[i]="_";
	        	   
	           }
	           else
	           {
	        	   str[i]=String.valueOf(brr[i]);
	           }
			
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}

	}

}
