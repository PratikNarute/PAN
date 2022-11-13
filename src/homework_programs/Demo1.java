package homework_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1
{
	  public static void main (String [] args)
	  {
  for (int i=0; i<=2000; i++)
	{
	int count=i,digit=0,n=i,rem=0;
	double sum=0;
	  
	  while (count>0)
	  {
	    count=count/10;
		digit++;
	  }
	  
	  while(n>0)
	  {
	    rem=n%10;
		sum=sum+(Math.pow(rem,digit));
		
		n=n/10;
		
	  }
	  
	  if (sum==i)
	  {
	    System.out.println(i+" This is a Armstrong Number");
	  }
	}
	
	
	  

	}

	 
}


