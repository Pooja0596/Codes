package HW;

public class startendspaces {

	public static void main(String[] args) 
	{
		
		String s = "   abc   hgf  lkj  ";
		char c[]= s.toCharArray();
		int cou=0;
		int si=0;
		int ei=0;
		for (int i = 0; i < c.length; i++)
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
			
		}
		for (int i = s.length()-1; i >=0; i--) 
		{
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
			
		}
	char df[]= new char[(ei-si)+1];
	int g=0;
	for (int i = si; i <=ei; i++)
	{
			df[g++]= c[i];
		
	}
	int d = 0;
	for (int i = 0; i < df.length; i++) 
	{
		if(df[i]==' ')
		{
			d++;
		}
		
	}
	for (int i = 0; i < df.length; i++) 
	{
		if(df[i]==' ' && df[i+1]==' ')
		{
			df[i]= '*';
		}
		
	}
	int y =0;
	for (int i = 0; i < df.length; i++) 
	{
		if(df[i]=='*')
		{
			y++;
		}
	}
	System.out.println(y);
	char e []= new char[df.length-y];
	int er=0;
	for (int i = 0; i < df.length; i++)
	{
		if(df[i]!='*')
		{
			e[er++]=df[i];
		}
	}
//	
	String ee= new String(e);
	System.out.println(ee);
	}

}
