package HW;

public class zeroone {

	public static void main(String[] args) 
	{
		
		int a[]= {0,1,0,1,0,1};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				
			
				if(a[j]==1)
				{
					int tem= a[j];
					a[j]= a[j+1];
					a[j+1]= tem;
				}
				}
		}
				
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			
		}	
			
		
	}

}
