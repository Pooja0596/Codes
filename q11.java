package HW;
//11) Write a program to convert all the characters in a string to lowercase.
public class q11
{
	public static void main(String[] args) 
	{
		String s = "POOJA";
		char c[]= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i]= (char) (c[i]+32);
			}
			
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]);
			
		}
	}

}
