package Assignment12;

public class ReplaceElementWithGreatest {

    public static  int[] replaceElements(int[] arr) {
    	for(int i=0;i<arr.length-1;i++)
		{
			int top=0;
			for(int j=i+1;j<(i+2);j++)
			{
				int max=arr[j];
				
				for(int k=j+1;k<arr.length;k++)
				{
					
					if(max<arr[k])
					{
						max=arr[k];
					}
				}
				
				top=max;
			}
			
			arr[i]=top;
			
		}
		
		arr[arr.length-1]=-1;
		
		return arr;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {17,18,5,4,6,1};
		
		int [] brr=replaceElements( arr);
		
		
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
		
		
		

	}

}
