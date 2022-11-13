package homework_programs;

public class RecursionBackTracking
{
	public void method(int a)
	{
		if (a==11)
		{
			return;
		}
		
		method(a+1);             // Back Tracking 
		System.out.println(a);  // it will executed when return the program 
	}
	
	
	public static void main(String[] args)
	{
	  RecursionBackTracking R= new  RecursionBackTracking();
	  R.method(1);
		
	}

}
