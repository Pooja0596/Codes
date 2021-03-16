package HW;

public class q17 {
//	17) Write a program to count and print all the duplicates in the input string.
	public static void main(String[] args) 
	{
		
		String s = "aababuabaa";// a =6 b = 3 u = 1
		char c []= s.toCharArray();
		int cou = 0;
		for (int i = 0; i < c.length; i++)
		{
			for (int j = i+1; j < c.length; j++) 
			{

				if(c[i]==c[j])
					{
						cou++;
						break;
					}
			}
			
		}
		System.out.println("count is :"+cou);
		char ca[]= new char[c.length-cou];
		int y =0;
		for (int i = 0; i < s.length(); i++)
		{
			boolean b = true;
			for (int j = 0; j < ca.length; j++) 
			{
				if(s.charAt(i)==ca[j])
				{
					b= false;
				}
				
			}
			if(b)
			{
				ca[y++]= s.charAt(i);
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			int co=0;
			for (int j = 0; j <s.length() ; j++) 
			{
				if(s.charAt(j)==ca[i])
				{
					co++;
				}
				
			}
			System.out.println(co+" "+ca[i]);
		}
		
		
		
	}

}
