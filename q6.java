package HW;

public class q6 
{
//	6) Write a program to get the last index of a string within a string.
	public static void main(String[] args) 
	{
		String s = "abc yxr olk";
		char c []= s.toCharArray();
		
		for (int i = 0; i < c.length; i++) 
		{
			int y =0;
			if(c[i]==' '|| i==c.length-1)
			{
				y = i-1;
				
			if( i==c.length-1)
			{
				y =i;
				
			}
			System.out.println(y+"  "+c[y]);
			}
			
		}
		
	}

}
