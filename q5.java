package HW;

public class q5 {
//	5) Write a program to get the index of all the characters of the alphabet.
	public static void main(String[] args) 
	{
		String s = "poja";
		char c[]= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			System.out.println(s.charAt(i)+" "+i);
			
		}
	}

}
