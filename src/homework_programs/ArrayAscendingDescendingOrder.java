package homework_programs;

import java.util.Arrays;

public class ArrayAscendingDescendingOrder
{
	public static void main(String[] args)
	{
		
		int a [] = {201,150,200,300,500,1000,1500,1300,1200};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int x=a[i];
					 a[i]=a[j];
					 a[j]=x;
							
				}	
			}
		}
		
		
		
		for (int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		System.out.println();
	System.out.println("*******************************************************************************************");	
		
	
	   
	    for (int i=0;i<a.length;i++)
	    {
	    	for (int j=i+1;j<a.length;j++)
	    	{
	    		if (a[i]<a[j])
	    		{
	    			int x=a[i];
					 a[i]=a[j];
					 a[j]=x;
	    		}
	    	}
	  
	    }
		for (int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		System.out.println();
		System.out.println("********************************************************************************************");
		
		
		
		
		{
			String a1[]= new String[3];
			a1[0]="2";
			a1[1]="5";
			a1[2]="1";

			
			int b=a1.length;
			
			Arrays.sort(a1);
			
			for(int i=0;i<b;i++)
			{
				System.out.print(" "+a1[i]);
			}
			
			System.out.println();
			
			for (int j=b-1;j>=0;j--)
			{
				System.out.print(" "+a1[j]);
			}
		
			
			
		}
	}
}
