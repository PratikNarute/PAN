package dailyMocks;

public class Greater_Number3
{
public static void main(String[] args) 
{
int p=1000,q=2000,r=3000,s=400,t=500;

if (p>q)
{
	if (p>r)
	{
		if (p>s)
		{
			if (p>t)
			{System.out.println("P is greater");}
			else
			{System.out.println("t is greater");}	
		}	
		
		
	 else
	   { 
	   if (s>t)
       {System.out.println("S is greater");}
       else
       {System.out.println("t is greater");}
		
	   }	
	 }	
	
	 else 
	 { 
	   if (r>s)
	   {
	     if (r>t) 
	     {System.out.println("r is greater");}
	     else
	     {System.out.println("t is greater");}    
	   }
	
	 	  else
	      {
	        if (s>t) 
		    {System.out.println("s is greater");}
		    else
		    {System.out.println("t is greater");} 
          }
      }
}

     else
     {
        if (q>r)
            {
               if (q>s) 
               {
            	   if (q>t)
                   {System.out.println("q is greater");}
                   else
                   {System.out.println("t is greater");}    
               }
               
         else
         {
    	   if (s>t) 
    	   {System.out.println("s is greater");}
    	   else
    	   {System.out.println("t is greater");} 
         }
            }
       
             else
             {
    	         if (r>s)
    	         {
    	        	 if (r>t)
    			     {System.out.println("R is greater");}
    			     else
    			     {System.out.println("t is greater");} 
                 }
    	           
    	           else
    	           {
    	        	   if (s>t)
    			       {System.out.println("S is greater");}
    			       else
    			       {System.out.println("t is greater");} 
                   }              	               	           
    	           
               }
    } 
		
}
}
