package HW;

public class q15 {
//	15) Write a program to return a string with the characters of the index position 
//			0,1,2, 5,6,7, ... from a given string.
	public static void main(String[] args)
	{
		
		String  s = "qwerttuiooghhj";
		
		for (int i = 0; i <s.length(); i+=5) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(s.charAt(i+j)+" ");
				
			}
			
		}
		
	}

}
//System.out.println(s.charAt(i));
//System.out.println(s.charAt(i+1));
//
