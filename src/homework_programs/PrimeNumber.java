package homework_programs;

public class PrimeNumber 
{
	public static void main(String[] args)
{
		
		int n=20;
		int c=0;
	     for (int i=2;i<n;i++) //5
	     {
	    	 if(n%i==0)  // for proving not prime no
	    	 {
	    		  c=1;
	    		  
	    	 }
	    	 break;
	     }
		
	     if (c==1)
	     {
	     System.out.println("not prime number");
	     }
	     
	     else
	     {
	    	 System.out.println(" prime number");
	     }
	     
	     
	     
	     System.out.println("*****************************************************");
	     
	     
	     
	        // find non prime Number from array
	     
	     int a[]= {1,2,3,4,5,6,17,18,19,20};
	     int b=0;
		
	     
	     for (int i=0;i<a.length;i++) //i=1
	     {
	               for (int k=2;k<a[i];k++)//k=3
	    		   {
	    			   if (a[i]%k==0) //
	    			   {
	    				 b=a[i]; //2
	    				 System.out.print(b+" ");
	    				
	    			   }
	    			   break;
	    		   }
	     
	     }
	     System.out.println();
	     
	     System.out.println("*****************************************************");
	     
	     
	     // Find prime number from 1 to 20 loop
	 	c=0;
	    for (int i=2;i<=20;i++)  //2 to 20 
	    {
	    	for (int j=2;j<i;j++) // 2 to 19
	    	{
	    		if (i%j==0) //
	    		{
	    			c=1;
	    			
	    		}
	    		
	    	}
	    	if (c==0)
			{
				System.out.print(i+" ");
			
			}
	    	else
			{
				c=0;
			}
	    }
	    System.out.println();
	    
	    System.out.println("*****************************************************");
	    
	    
	    
	   // find prime no from array
	    
	    int x[]= {1,2,5,4,10,15,19};
	    int y=0; 
	   for (int i=0;i<x.length;i++)
	   {
		   for(int j=2;j<x[i];j++)
		   {
			   if (x[i]%j==0)
			   {
				   b=1;
			   }
		   }
		   if (b==0)
		   {
			   System.out.print(x[i]+" ");
		   }
		   else
		   {   
			   b=0;
		   }
		   
	   }

	    
	    
	     
}
}
