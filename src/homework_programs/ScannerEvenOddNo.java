package homework_programs;

import java.util.*;

public class ScannerEvenOddNo 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter num");
	int num = scan.nextInt();
	
	if(num%2==0)
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
	
	
}
}
