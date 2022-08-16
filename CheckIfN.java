package Assignment12;

public class CheckIfN {

    public static boolean checkIfExist(int[] arr) {
    	boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(temp%2==0)
				{
					if((temp*2)==arr[j])
					{
						b=true;
						break;
					}
					else if(temp/2==arr[j])
					{
						b=true;
						break;
					}
					
					
				}
				else
				{
					if(temp*2==arr[j])
					{
						b=true;
						break;
					}
					
					
					
				}
				
				
				
			}
			
			
		}
		if(b==true)
		{
			return true;
			
		}
		else
		{
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr= {10,2,7,3};
		//int [] arr= {7,1,14,11};
		int [] arr= {3,1,6,11};
		boolean c=checkIfExist(arr);
		if(c==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
