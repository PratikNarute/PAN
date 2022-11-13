package homework_programs;

public class Recursion
{
	int sum =0,Factorial=1;
	
	
	public void method(int a) // Print Sum of natural number from (1 to 5)
	{
		sum=sum+a; 
		if( a==5)
		{
		   System.out.println("Sum of natural number from (1 to 5) is : "+sum);
		   return;	
		}
		
		  method(a+1);
	}
	
	
	public void method1(int b)  // Print from (1 to 20)
	{
		if (b==4)
		{
			return;
		}
		System.out.print(b+" ");
		method1(b+1);
		
	}
	
	
	public static void main(String[] args)
	{
		
		Recursion z= new Recursion();
	     z.method(1);
	    System.out.println("************************************************");
	    
	     z.method2(4);
	     System.out.println("***********************************************");
	     
	     System.out.print("Print Numbers from (1 to 20) is : ");
	     z.method1(1);
	     System.out.println();
	     System.out.println("***********************************************");
	}
	
	
	public void method2(int a) // Print Sum of natural number from (1 to 5)
	{
		
		Factorial=Factorial*a; 
		if( a==1)
		{
		   System.out.println("Factorial Number of 4 is : "+Factorial);
		   return;	
		}
		  method2(a-1);
	}
		

}
