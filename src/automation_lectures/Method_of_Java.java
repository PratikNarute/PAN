package automation_lectures;

public class Method_of_Java 
{
public static void Pro()                    //  user defined Method/regular method
{
	//  Method Body
	System.out.println("P");
	System.out.println("P");                 //   Repeated Code
	System.out.println("N");
}

public static void main(String[] args)      //   System Defined Method/main method
	{
		Method_of_Java.Pro();                             //    Method calling
		
		System.out.println("PRATIK");
		
		Pro();
		
		System.out.println("PANDURANG");
		
		Pro();
		
		System.out.println("NARUTE");
	}
	
}
