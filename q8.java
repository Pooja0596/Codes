package HW;
//8) Write a program to replace all the 'd' characters with 'f' characters.
public class q8 
{
	public static void main(String[] args)
	{
		String s = "afddddlkiddd";
		char c []= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]=='d')
			{
				c[i]= 'f';
			}
			
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]);
			
		}
	}

}
