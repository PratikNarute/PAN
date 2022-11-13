package homework_programs;

public class CountOfString 
{
   public static void main(String[] args) 
   {
	
	String a = "programming";
	int b=0;
	
	for (int i=0; i<a.length()-1; i++)
	{
		for (int j=i+1;j<a.length(); j++)
		{
			if (a.charAt(i)==a.charAt(j))
			{
				b++;
			}
		}
	}
	System.out.println(b);
		
	
   }
}
