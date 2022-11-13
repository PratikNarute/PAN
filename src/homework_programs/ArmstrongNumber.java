package homework_programs;

import java.util.Scanner;

public class ArmstrongNumber
{
public static void main(String[] args)
{


                  // using while loop using scanner
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter value of Armstrong Number");
	int n=scan.nextInt();
	
	
	int rem,sum=0;
	int N=n;
	
	while (n>0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;	
	}
	
	if (N==sum)
	{
		System.out.println(N+" It is an Armstrong Number");
	}
	
	else 
	{
		System.out.println(N+" It is not an Armstrong Number ");
	}
	
	System.out.println("***************************************************");
	
		 // using for loop
	
	int N1=407,sum1=0,rem1;   
	
	
	for(int i=N1;i>0;i=i/10)  //0
	{
		rem1=i%10;     //3                            
		sum1=sum1+(rem1*rem1*rem1);//  0+343+27   
	}		
	if(N1==sum1) // 370=370
	{
		System.out.println("Given number "+N1+" is an armstrong number");
	}
	else
	{
		System.out.println("Given number "+N1+" is not an Armstrong number");
	}		

	

	System.out.println("**************************************************");


	
	for(int n2=1;n2<=2000;n2++)  //1  
	
	{
		int count=n2,digit=0,rem2,N2=n2;
		double add=0;
		
		
		while (count>0) // 1
		{
			count=count/10; // 0
			digit++; // 3
		}
		//System.out.println(digit);
		
		//  407 = 7  0    4
		while (N2>0) //0
		{
		rem2=N2%10; // 4
		add =add+(Math.pow(rem2, digit)); // 343.00+0+64=407
		
		N2=N2/10; //0
		}
		
		
		if (add==n2)//1==1
		{
		System.out.println(n2+" it is armstong number");	
		}
		

	}

	
	
	             
	
}
}