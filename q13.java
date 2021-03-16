package HW;
//13) Write a program to remove a specified character from a given string
public class q13 
{

	public static void main(String[] args) 
	{
		String s = "pooja";
		char ch = 'o';
		char c []= s.toCharArray();
		int count=0;
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]== c[j])
				{
					count++;
					break;
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
