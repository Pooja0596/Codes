package HW;
//12) Write a program to convert all the characters in a string to uppercase
public class q12 
{

	public static void main(String[] args)
	{
		String s = "pooja";
		char c []= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>=97 && c[i]<=122)
			{
				c[i]= (char) (c[i]-32);
			}
			
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
			
		}
	}

}
