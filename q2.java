package HW;

public class q2 
{
//	2) Write a program to check whether a given string ends with the contents of another string.
	public static void main(String[] args) 
	{
		String s = "pooja";
		String j = "apple";
		boolean b = true;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!=j.charAt(i))
			{
				b= false;
				
			}
			
		}
		if(b)
		{
			System.out.println("equal strings ");
		}
		else
			System.out.println("not equal");
	}

}
