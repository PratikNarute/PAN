package homework_programs;

public class DuplicateString 
{
	public static void main(String[] args) 
	{
		String a  = "PratPaAaP";
		String sum=" ";
		String add= " ";
		char arr[] = {};
		
		a.toCharArray();
		for (int i=0; i<a.length()-1; i++)
		{
			for (int j=i+1; j<a.length(); j++)
			{
				if (a.charAt(i)==a.charAt(j))
				{			
		
					sum =sum+ a.charAt(i);
					
					
				}
			}			
		}
		System.out.println(sum.toCharArray());
		

		
	}

}
