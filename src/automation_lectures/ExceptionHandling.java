package automation_lectures;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		int a=10,b=0,c;
		
		int d[]= {1,2,3,4};
		
		//System.out.println(a/b);
		System.out.println(d[4]);
		
		try
		{
			//c=a/b;
			c=d[4];
			
		}
		
		catch (ArithmeticException e)
		{
			b=1;
			//System.out.println(a/b);
		
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			c=d.length;
			System.out.println(c);
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			e.toString();
		}
		
		finally
		{
			System.out.println("Pratik Narute");
			
		}
		
		
	}

}
