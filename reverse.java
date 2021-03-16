package HW;

public class reverse {

	public static void main(String[] args) 
	{
		
		String s = "abc ghj pqr";
		String h []=s.split(" ");
		String d[]= new String[h.length];
		int ii =0;
		for (int i = 0; i < h.length; i++)
		{
			char c []= h[i].toCharArray();
			for (int j = 0; j < h.length/2; j++) 
			{
				char te= c[j];
				c[j]= c[c.length-1-j];
				c[c.length-1-j]= te;
			}
			String h1 =new String(c);
			d[ii++]= h1;
		}
		for (int i = 0; i < d.length/2; i++) 
		{
			String st = d[i];
			d[i]= d[d.length-1-i];
			d[d.length-1-i]= st;
			
		}
		for (int i = 0; i < d.length; i++) 
		{
			System.out.println(d[i]);
			
		}
	}

}
