package HW;

public class q30 {

	public static void main(String[] args) 
	{
		String[] s = {"pooja","aba","nitin","madam"};
		String p[]= new String[s.length];
		int k=0;
		for (int i = 0; i < s.length; i++)
		{
			StringBuffer sb = new StringBuffer(s.length);
			if(sb.reverse().toString().equals(s[i]))
			{
				p[k++]= s[i];
				System.out.println(p[k]);
			}
		}
		for (int i = 0; i <k; i++) 
		{
			for (int j = i+1; j < k; j++) 
			{
				if(p[i].compareTo(p[j])>0)
				{
					String t= p[i];
					p[i]= p[j];
					p[j]=t;
				}
				
			}
			
		}
		for (int i = 0; i < k; i++) 
		{
			System.out.println(p[i]);
			
		}
	}

}
