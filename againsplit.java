package HW;

public class againsplit {

	public static void main(String[] args)
	{
		
		String s = "pooja T Babar";
		char c[]= s.toCharArray();
		int co=0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ')
			{
				co++;
			}
			
		}
		String h []= new String[co+1];
		int ei=0;
		int si=0;
		
		int q=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ' || i==c.length-1)
			{
				ei=i-1;
				if(i==c.length-1)
				{
					ei= i;
				}
				int r =0;
				char c1[]= new char[(ei-si)+1];
				for (int j = si; j <=ei; j++)
				{
					c1[r++]=c[j];
				}
				String y = new String(c1);
				h[q++]= y;
				si= i+1;
			}
		}
		
		for (int i = 0; i < h.length; i++) 
		{
			System.out.print(h[2]+" "+h[0]+" "+h[1]);
			break;
		}
		
		
	}

}
