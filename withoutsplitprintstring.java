package HW;

public class withoutsplitprintstring
{
//	34) Write a program to find largest & smallest word in a string
	public static void main(String[] args) 
	{
		String s = "abc xy prjjj";
		char c[]= s.toCharArray();
		int count =0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
			{
				count++;				
			}
			
		}
		String d[]= new String[count+1];
		int si=0;
		int ei =0;
		int y=0;
		for (int i = 0; i < c.length; i++) 
		{
			
			if(c[i]==' ' || i==c.length-1)
			{
				ei= i-1;
				if(i==c.length-1)
				{
					ei=i;
				}
				int r =0;
				char ua[]= new char[(ei-si)+1];
				for (int j = si; j <=ei; j++) 
				{
					ua[r++]= c[j];
					
					
				}
			
				String r1= new String(ua);
				d[y++] = r1;			
				si = i+1;
			}
		}
		int min= Integer.MAX_VALUE;
		int mini=0;
		int maxi =0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < d.length; i++)
		{
			if(d[i].length()<min)
			{
				min= d[i].length();
				mini = i;
			}
			else if(d[i].length()>max)
			{
				
				max= d[i].length();
				maxi = i;
			}
			
		}
		System.out.println(min+" "+d[mini]);
		System.out.println(max+" "+d[maxi]);
		
		
	}

}
