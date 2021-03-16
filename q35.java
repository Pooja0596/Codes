package HW;
//35) Write a program to delete all extra spaces in string.
public class q35
{

	public static void main(String[] args) 
	{
		String s = "abc  xyz   pqr";
		System.out.println(s);
		int count=0;
		char c[]= s.toCharArray();
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
			{
				count++;	
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ' && c[i+1]==' ')
			{
				c[i]='*';
			}
		}
		int m = 0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ')
			{
				m++;
			}
			
		}
		char ua[]= new char[c.length-m];
		int u =0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]=='*')
			{
				continue;
			}
			else
			{
				ua[u++]= c[i];
			}
		}
		for (int i = 0; i < ua.length; i++) 
		{
			System.out.print(ua[i]);
			
		}
		
	}

}
