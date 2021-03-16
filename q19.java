package HW;
//19) Write a program to find the maximum occurring character in a string.
public class q19 
{

	public static void main(String[] args) 
	{
		
		String s = "aaaabbbccd"; //a =4 b=3 c=2 d =1
		char c []= s.toCharArray();
		int u = 0;
		for (int i = 0; i < c.length; i++)
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]==c[j])
				{
					u++;
					break;
				}
				
			}
			
		}
		
		char ua[]= new char[c.length-u];
		int f = 0;
		for (int i = 0; i < s.length(); i++)
		{
			boolean b = true;
			for (int j = 0; j < ua.length; j++) 
			{
				if(s.charAt(i)== ua[j])
				{
					b = false;	
				}
			}
			if(b)
			{
				ua[f++]= s.charAt(i);
			}
			
		}
		for (int i = 0; i < ua.length; i++) 
		{
			System.out.print(ua[i]+" ");
			
		}
		System.out.println();
		int ui[]= new int[ua.length];
		int e=0;
		
		for (int i = 0; i < ua.length; i++)
		{
			int cou=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(ua[i]==s.charAt(j))
				{
					cou++;
				}
				
			}
			ui[e++]= cou;
			
		}
		for (int i = 0; i < ui.length; i++) 
		{
			for (int j = i+1; j < ui.length; j++)
			{
				if(ui[i]>ui[j])
				{
					int te= ui[i];
					ui[i]= ui[j];
					ui[j]= te;
					
					char d= ua[i];
					ua[i]= ua[j];
					ua[j]= d;
				}
				
			}
		}
		for (int i = 0; i < ui.length; i++) 
		{
			
//				System.out.println(ui[i]+" "+ua[i]);
			System.out.println(ui.length-2+" "+ua[ua.length-2]);
			break;
				
			}
			
		}
	

}
