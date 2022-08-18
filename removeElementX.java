package Assignment12;

public class removeElementX {

	public static int [] m2(int [] arr , int len,int val)
	{
		int [] brr = new int[len];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=val)
			{
				brr[j]=arr[i];
				j++;
			}
		}
		
		return brr;
	}
	public static int[]  m1(int [] arr, int val)
	{
		int icnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				icnt++;
			}
		}
		
     	int j=0;
		int k=arr.length-icnt;
		
	
		
		return m2(arr,k,val);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,8,4,2,1,4,4,5};
		int val=4;
		int [] brr= m1(arr,val);
		System.out.print("Array is : ");
		
		
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}

}
