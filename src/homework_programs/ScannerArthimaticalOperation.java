package homework_programs;

import java.util.*;

public class ScannerArthimaticalOperation
{                       
	        // Note = scan.nextLine() for String datatype

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);           //object of scanner
		
		System.out.println("enter value of a");
		int a= scan.nextInt();                   
		
		System.out.println("enter value of b");
		int b=scan.nextInt();
		
		System.out.println("enter value of c");
		int c=scan.nextInt();
		
		int z=a+b+c;
		System.out.println(z);
		
	}
	
	
	
	
}
