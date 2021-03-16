package HW;

public class repeatedchar {

	public static void main(String[] args) 
	{
		
		String s="abcdaabuiopl";
		int jmax=0;
		int imax=0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i+1; j < s.length(); j++) 
			{
			int count = 0;
				for (int k = i; k < j; k++)
				{
					if (s.charAt(k) == s.charAt(j))
					{
						count++;
					}
					if (j == s.length()-1)
					{
						count++;
					}
				}
				if (count > 0) 
				{
					if (j != s.length()-1)
					{
						if ((jmax - imax) < (j-i))
						{
							jmax = j;
							imax = i;
						}
					}
					else
					{
						if ((jmax - imax) < (j-i+1)) 
						{
							jmax = j+1;
							imax = i;
						}
					}
					break;
				}
			}
			
		}
		System.out.println(jmax-imax);
		for (int i = imax; i < jmax; i++)
		{
			System.out.print(s.charAt(i));
		}
	}

}
