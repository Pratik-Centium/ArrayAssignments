package Assignment12;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={0,0,3,4,5,6,4,5,6,4};
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(temp!='-')
				{
					if(temp==arr[j])
					{
						arr[j]='-';
					}
					
				}
				
			}
		}
		
//		
		
		
		for(int k=0;k<arr.length-1;k++)
		{
			if(arr[k]==45)
			{
				int i=k;
				while(i<arr.length-1)
				{
					arr[i]=arr[i+1];
					i++;
				}
				
			}
		}
		

		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}

}
