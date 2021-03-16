package HW;
//14) Write a program to test if a given string contains only digits
public class q14
{

	public static void main(String[] args) 
	{
		String s = "123";
		boolean b =true; 
		char c []= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]<48 || c[i]>57)
			{
				b = false;
				break;
			}
		}
		if(b)
		{
			System.out.println("number ");
		}
		else
			System.out.println("mix");
	}

}
