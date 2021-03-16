package HW;

public class q18 
{
	//18) Write a program to reverse every word in a string using methods.
	public static void main(String[] args)
	{
		
		String s = "abc efg hij";
		String s1[]=  s.split(" ");
		String h[]=new String[s1.length];
		for (int i = 0; i < s1.length; i++) 
		{
			char f[]= s1[i].toCharArray();
			for (int j = 0; j < f.length/2; j++) 
			{
				char a = f[j];
				f[j] =  f[f.length-1-j];
				f[f.length-1-j]= a;
			}
//			
			String s11= new String(f);
			h[i] = s11;
			
		}
		for (int i = 0; i < h.length; i++) 
		{
			System.out.println(h[i]);
		}
		
		
//		for (int i = 0; i < h.length/2; i++)
//		{
//			String d= h[i];
//			h[i]= h[h.length-1-i];
//			h[h.length-1-i]= d;
//			
//		}
//		System.out.println("*********");
//		for (int i = 0; i < h.length; i++) 
//		{
//			System.out.println(h[i]);
//			
//		}
//		
		
	}

}
