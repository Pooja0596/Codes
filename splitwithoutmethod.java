package HW;

public class splitwithoutmethod 
{
	public static void main(String[] args) 
	{
		String s = "abc edf lkj wer";
		char c []= s.toCharArray();
		int co=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
			{
				co++;
			}
		}
		String m[]= new String[co+1];
		int si=0;
		int ei=0;
		int w =0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ' || i==c.length-1)
			{
				ei=i-1;
				if(i==c.length-1)
				{
					ei= i;
				
				}
				int r=0;
			char uc[]= new char[(ei-si)+1];
			
			for (int j = si; j <=ei; j++)
			{
				uc[r++]= c[j];
				
			}
			String j= new String(uc);
			m[w++]= j;
				si= i+1;
			}
		
		}
		for (int j = 0; j < m.length; j++)
		{
			System.out.println(m[j]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
