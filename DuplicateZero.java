package Assignment12;

public class DuplicateZero {

  
	  public static void duplicateZeros(int[] arr) {
		    
		    int length=arr.length;
				
				int [] brr = new int[length];
				
				
				for(int i=0,j=0;i<arr.length&&j<arr.length;i++,j++)
				{
					
					
					if(arr[i]==0)
					{
						brr[j]=0;
						j++;
						brr[j]=0;
						

					}
					else 
					{
						brr[j]=arr[i];
						

						
					}
					
					
				}
		        
				for(int i=0;i<brr.length;i++)
		    {
		        System.out.println(brr[i]);
		    }

		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,0,2,3,0,6,5,0};
		
		duplicateZeros(arr);
		
		

	}

}
