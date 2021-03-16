package HW;

public class q355 {

	public static void main(String[] args) 
	{
		String s= "abc   hgj  kli";
		char c[]= s.toCharArray();
		int cou= 0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
			{
				cou++;
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ' && c[i+1]==' ')
			{
				c[i]= '*';
			}
			
		}
		int r=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]=='*')
			{
				r++;
			}
			
		}
		System.out.println(r);
		
		char f[]= new char[c.length-r];
		int k=0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]!='*')
			{
				f[k++]= c[i];
			}
			
			
		}
		
		String h =new String(f);
		System.out.println(h);
	}

}
