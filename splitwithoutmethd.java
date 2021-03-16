package HW;

public class splitwithoutmethd 
{
//strring to char array and count spaces
	//main String whos lenth is string leg - count
	// strt in , end ind 
	//start index to end index of each string
	public static void main(String[] args)
	{
		String s = "abc xy prjjj";
		char c []= s.toCharArray();
		int count =0;
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]==' ')
			{
				count++;
			}
			
		}
		String s1[]= new String[count+1];
		int si=0;
		int ei=0;
		int co=0;
		
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ' || i==c.length-1)
			{
				ei=i-1;
				if(i==c.length-1)
				{
					ei=i;
				}
				int f=0;
				char d[]= new char[(ei-si)+1];
				for (int j = si; j <=ei; j++)
				{
					d[f++]= c[j];
					
				}
				String r1= new String(d);
				s1[co++] = r1;	
				
				si=i+1;
				
			}
		}
		for (int j = 0; j < s1.length; j++)
		{
			System.out.println(s1[j]);
			
		}
		
	}

}
