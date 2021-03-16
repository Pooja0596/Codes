package HW;

public class maxcount
{

	public static void main(String[] args)
	{
		String s ="aabbaceeee";//a=3 b=2 a=1; e=4
		char c []= s.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++)
			{
				if(c[i]==c[j])
				{
					count++;
					break;
				}
				
			}
			
		}
		//System.out.println(count);
		char uc[]= new char[c.length-count];
		int w=0;
		for (int i = 0; i < c.length; i++)
		{
			boolean f= true;
			for (int j = 0; j < uc.length; j++)
			{
				if(c[i]==uc[j])
				{
					f= false;
					break;
				}
				
			}
			if(f)
			{
				uc[w++]= c[i];
			}
			
		}
		for (int i = 0; i < uc.length; i++)
		{
			System.out.println(uc[i]);
			
		}
		int ui[]= new int[uc.length];
		int r =0;
		for (int i = 0; i < uc.length; i++)
		{
			int co=0;
			for (int j = 0; j < c.length; j++)
			{
				if(uc[i]==c[j])
				{
					co++;
//					break;
				}
				
			}
			ui[r++]= co;
		}
		
		for (int i = 0; i < ui.length; i++) 
		{
			for (int j = i+1; j < ui.length; j++) 
			{
				if(ui[i]>ui[j])
				{
					int te= ui[i];
					ui[i]= ui[j];
					ui[j]= te;
					
					char c1 =uc[i];
					uc[i]=uc[j];
					uc[j]= c1;
				}
				
			}
			
		}
		for (int i = 0; i < ui.length; i++) 
		{
			System.out.println(ui[i]+" "+uc[i]);
			
		}
				
		
	}

}
