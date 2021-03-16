package HW;
//9) Write a program to check whether a given string starts with the contents of another string.
public class q9
{

	public static void main(String[] args)
	{
		String s = "pooja";
		String a = "niv";
		boolean b = true;
		for (int i=0;i<a.length();i++)
		{
		if(a.charAt(i)!=s.charAt(i))
		{
			b = false;
		}
			
		}
		if(b)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
		
		
		
	}

}
