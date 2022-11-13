package automation_lectures;

public class ConditionStatement
{
	public static void main(String[] args)
	{
	int a=1000,b=2000,c=5000,d=4000;

	if (a>b)  
	{                                  
		if(a>c)
		{
			if(a>d)
			{System.out.println("A is greater value");}	
			else
			{System.out.println("D is greater value");}	
				
		}
		
		else 
		{
		  if(c>d)
		  {System.out.println("C is greater value");}	
		  else	
		  {System.out.println("D is greater value");}
		}
	 }			
				
		else 
		{
			if(b>c)
			{
				if (b>d)
			
				{System.out.println("B is greater value");}	
			    else	
			    {System.out.println("D is greater value");}
			}
				
				
			else
			{
				if(c>d)
			    {System.out.println("C is greater value");}
				else	
			    {System.out.println("D is greater value");}
			}
		}		
				
					
		
	}
}


