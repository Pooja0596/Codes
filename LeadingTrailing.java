package HW;

public class LeadingTrailing 
{

	public static void main(String[] args) 
	{
		String s = "   abc  xyz   pqr  ";
		char c[]= s.toCharArray();
//		System.out.println(cS.length);
		int si=0;
		int ei =0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]!=' ')
			{
			si=i;
			break;
			}
		}
		for (int i = c.length-1; i >=0; i--)
		{
			if(c[i]!=' ')
			{
				ei=i;
				break;
			}
			
		}
		char f[]= new char[(ei-si)+1];
		int r=0;
		for (int i = si; i <=ei; i++) 
		{
			f[r++]= c[i];
		}
		for (int i = 0; i < f.length; i++)
		{
			if(f[i]==' ' && f[i+1]==' ')
			{
				f[i]='*';
			}
		}
		int count=0;
		for (int i = 0; i < f.length; i++)
		{
			if(f[i]=='*')
			{
				count++;
//				break;
			}
			
		}
		char ui[]= new char[f.length-count];
		int g =0;
		for (int i = 0; i < f.length; i++)
		{
			if(f[i]!='*')
			{
				ui[g++]= f[i];
			}
			else
				continue;
			
			
		}
		for (int i = 0; i < ui.length; i++)
		{
			System.out.println(ui[i]);
			
		}
		}

}
