package homework_programs;

public class Reverse_string
{
   public static void main(String[] args)
   {
	   // Reverse string
	   
	   String a1="group no 17"; //
	   
	   for (int b=0;b<a1.length();b++) //b=1
	   {
		   System.out.print(a1.charAt(b));  // group no 17
	   }
	   
	   System.out.println();
	   
	   for (int b=a1.length()-1;b>=0;b--)//b=4
	   {
		  System.out.print(a1.charAt(b)); //
	   }
	   
	   System.out.println();
		System.out.println("=================================================================");
		
		
		// reverse the world at same position in string
	   
		String a="group no 17";
		System.out.println(a);

		String b[]=a.split(" "); //b []={group,no,17}
		
		String P=b[0]; //String p ="group"; 
		String p=b[1]; //no
		String N=b[2]; //17
		
		for (int c=P.length()-1;c>=0;c--)//c=1=r
		{
			System.out.print(P.charAt(c));//puorg
		}
		
		System.out.print(" ");
		
		for (int c=p.length()-1;c>=0;c--)
		{
			System.out.print(p.charAt(c));
		}
		
		System.out.print(" ");
		
		for (int c=N.length()-1;c>=0;c--)
		{
			System.out.print(N.charAt(c));
		}
		
		System.out.print(" ");
		
	System.out.println();
	System.out.println("=======================================================================");
	


   }
}
