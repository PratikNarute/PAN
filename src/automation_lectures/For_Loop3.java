package automation_lectures;

public class For_Loop3 
{
public static void main(String[] args)
{
int a,b,c,d,e,f,g,h,i;

for(a=1;a<=5;a++)
{
  for (b=1;b<=5;b++)
  {System.out.print("*");}
	
  System.out.println();
}	
	
System.out.println("--------------------------------------------------");
	
for(c=1;c<=5;c++)
{
   for (d=1;d<=c;d++)
   {System.out.print("*");}
		
   System.out.println();
}	
		
System.out.println("--------------------------------------------------");
			
for(e=1;e<=5;e++)
{
   for (f=5;f>=e;f--)
   {System.out.print("*");}
		
   System.out.println();
}	
		
System.out.println("--------------------------------------------------");

for (g=1;g<=5;g++)
{
	for (h=5;h>g;h--)
	{System.out.print(" ");}
	
	for (i=1;i<=g;i++)
	{System.out.print("*");}
	
	System.out.println();

}




}
}	
	
	
	
	
	
	
	
	


