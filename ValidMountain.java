package Assignment12;

public class ValidMountain {

	public static int[] getSliceOfArray(int[] arr,int start, int end)
	{
		int[] slice = new int[end - start];
		for (int i = 0; i < slice.length; i++) {
		slice[i] = arr[start + i];
	}


		return slice;
	}
	public static boolean increasing(int [] inc)
	{
		int icnt=0;
		int i;
		for(i=0;i<inc.length-1;i++)
		{
			if(inc[i]<inc[i+1])
			{
				icnt++;
			}
			else
			{
				break;
			}
			
		}
		
		if(inc.length-1==icnt)
		{
			return true;
		}
		return false;
		
	}
	public static boolean decreasing(int [] dec)
	{
		int icnt=0;
		int i;
		for(i=0;i<dec.length-1;i++)
		{
			if(dec[i]>dec[i+1])
			{
				icnt++;
			}
			else
			{
				break;
			}
			
		}
		
		
		if(dec.length-1==icnt)
		{
			return true;
		}
		return false;
		
		
		
		
		
	}
	public static boolean m1(int [] arr)
	{
		int index = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				index=i+1;
			}
			else
			{
				break;
			}
		}
		
		int [] inc=getSliceOfArray(arr,0, index+1);
		int [] dec=getSliceOfArray(arr,index+1,arr.length);

		boolean result=increasing(inc);
		boolean result2=decreasing(dec);
		
		
		if(result==true&&result2==true)
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

		int [] arr = {1,2,3,4,5,6,3,2,1};
		boolean result=m1(arr);
		if(result==true)
		{
			System.out.println("is mountain");
		}
		else
		{
			System.out.println("is not mountain");
		}
	
	}

}
