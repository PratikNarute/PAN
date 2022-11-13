package homework_programs;

import java.util.Scanner;

public class ScanReverseString 
{
	
		public static void main(String[] args) 
		{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter string");
	   
	   String a=scan.nextLine(); //a=vimit; i=0-4;
	   
	   for (int b=0;b<a.length();b++)//b=2
	   {
		   System.out.print(a.charAt(b));//vimit
	   }
	   
	   System.out.println();
	   System.out.println("======================================");
	    
	   for(int b=a.length()-1;b>=0;b--) //i=4-0;3,2,1,0
	   {
		   System.out.print(a.charAt(b)); //timiv
	   }
	   
	   System.out.println();
	   System.out.println("======================================");
	}
     
		
	
		
		
		

}
