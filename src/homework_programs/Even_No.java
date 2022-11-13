package homework_programs;

public class Even_No 
{
public static void main(String[] args)
{
int a,b;

  for (a=2;a<=50;a++)
    {
	  if (a%2==0)
	  System.out.println(a);
    }
	
  
  System.out.println(".........................");
  
  
  a=1;
  while (a<=50)
    {
	  a++;
	  if (a%2==0)
	  System.out.println(a);
    }
  
  System.out.println(".........................");
  
  a=0;
  while (a<50)
  {
     a=a+2;
	System.out.println(a);	  
 
  }
  System.out.println(".........................");
  
}
}
