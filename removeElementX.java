package Assignment12;

public class removeElementX {

	public static String [] m1(int [] arr, int val)
	{
		int icnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				icnt++;
			}
		}
		
		String [] brr= new String[arr.length];
		int j=0;
		int k=brr.length-icnt;
		
//		System.out.println(k);
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=val)
			{
				brr[j]=String.valueOf(arr[i]);
				j++;
				
			}
			else
			{
				brr[k]="_";
				k++;
				
			}
		}
		
		return brr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,2,2,3,3};
		int val=3;
		String [] brr= m1(arr,val);
		System.out.print("Array is : ");
		
		
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}

}
