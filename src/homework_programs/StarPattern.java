package homework_programs;

public class StarPattern
{
	public static void main(String[] args) 
	{
		       // Rhombus
		
	    /*              *************
	     *             *************
	     *            *************
	     *           *************  
	     *          *************
	     * 
	     * 
	     */
			
			
			for (int a=1;a<=5;a++)
			{
				for (int b=5;b>a;b--)
				{
					System.out.print(" ");
				}
				for (int c=1;c<=13
						;c++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		System.out.println("=======================================================================");	
			
		
		
			// Hollow Rhombus
			
		 /*              *************
	                    *           *
		               *           *
		              *           *  
		             *************            
		  */
		
			System.out.println("    *************");
			for (int a=1;a<=3;a++) //a=1
			{
				for (int b=3;b>=a;b--) //b=3
				{
					System.out.print(" ");
				}
				for (int c=1;c<=1;c++) //c=
				{
					System.out.print("*           *");
				}
				System.out.println();
			}
			System.out.println("*************");
			
			System.out.println("=======================================================================");	
		
	 /*          Left side right angle triangle
	  * 
	  *            * 
	  *            **
	  *            *** 
	  *            **** 
	  *            *****
	  *            ****
	  *            ***
	  *            **
	  *            *
	  */
			
			
			  for (int a=1;a<=5;a++)
			  {
				  for (int c=1;c<=a;c++)
				  {
					  System.out.print("*");
				  }
				  System.out.println();
			  }
			  
			  
			  for (int a=1;a<=4;a++)
			  {
			      for (int c=4;c>=a;c--)
				  {
					  System.out.print("*");
				  }
				  System.out.println();
			  }
			  
			  
	       System.out.println("=======================================================================");	
	       
	       
	 /*          Right side right angle triangle
	  	  
	  	             * 
	  	            **
	  	           *** 
	  	          **** 
	  	         *****
	  	          ****
	  	           ***
	  	            **
	  	             *
    */
	  			
	  			
	  		  for (int a=1;a<=5;a++)
	  		  {
	  			  for (int b=4;b>=a;b--)
	  			  {
	  				  System.out.print(" ");
	  			  }
	  			  for (int c=1;c<=a;c++)
	  			  {
	  				  System.out.print("*");
	  			  }
	  			  System.out.println();
	  		  }
	  		  
	  		  for (int a=1;a<=4;a++)
	  		  {
	  			  for (int b=1;b<=a;b++)
	  			  {
	  				  System.out.print(" ");
	  			  }
	  			  for (int c=4;c>=a;c--)
	  			  {
	  				  System.out.print("*");
	  			  }
	  			  System.out.println();
	  		  }
	  		  
			
		  System.out.println("=======================================================================");
		  
		  
		  
      	 /*           Diamond
	  	  
                      * 
                     * *
                    * * * 
                   * * * * 
                  * * * * *
                   * * * *
                    * * *
                     * *
                      *
        */
		 
		  
		  for (int a=1;a<=5;a++)
		  {
			  for (int b=4;b>=a;b--)
			  {
				  System.out.print(" ");
			  }
			  for (int b=1;b<=a;b++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  
		  for (int a=4;a>=1;a--)
		  {
			  for (int b=a;b<=4;b++)
			  {
				  System.out.print(" ");
			  }
			  for (int c=1;c<=a;c++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  
		
		 System.out.println("=======================================================================");
		  
		 
		 /*            Odd Number Diamond
		  *             
		  *                           * 
		  *                          ***
		  *                         *****
		  *                        ******* 
		  *                       *********
		  *                        *******
		  *                         *****
		  *                          ***
		  *                           *
		  * 
		  */
		 
		       
		    for (int a=1;a<=5;a++)
		    {
		    	for (int b=a;b<=4;b++)
		    	{
		    		System.out.print(" ");
		    	}
		    	for (int c=1;c<=(2*a-1);c++)
		    	{
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    for (int a=4;a>=1;a--)
		    {
		    	for (int b=a;b<=4;b++)
		    	{
		    		System.out.print(" ");
		    	}
		    	for (int c=1;c<=(2*a-1);c++)
		    	{
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    
		  System.out.println("=======================================================================");
		   
		  
		  

			 /*            Even Number Diamond
			  *             
			  *                           **
			  *                          ****
			  *                         ******
			  *                        ******** 
			  *                       **********
			  *                        ********
			  *                         ******
			  *                          ****
			  *                           **
			  * 
			  */
		  
		  
		     for (int a=1;a<=5;a++)
		     {
		    	 for (int b=a;b<=4;b++)
		    	 {
		    		 System.out.print(" ");
		    	 }
		    	 for (int c=1;c<=(2*a);c++)
		    	 {
		    		 System.out.print("*");
		    	 }
		    	 System.out.println();
		     }
		     
		     for (int a=4;a>=1;a--)
		     {
		    	 for (int b=4;b>=a;b--)
		    	 {
		    		 System.out.print(" ");
		    	 }
		    	 for (int c=1;c<=(2*a);c++)
		    	 {
		    		 System.out.print("*");
		    	 }
		    	 System.out.println();
		     }
		     
		System.out.println("=======================================================================");
		
		
             // 
/*                 * * * * *
 *                  * * * *
 *                   * * *
 *                    * *
 *                     *
 *                     *
 *                    * *
 *                   * * *
 *                  * * * *
 *                 * * * * *
 * 
 */
	
               for (int a=5;a>=1;a--)
               {
	           for (int b=5;b>=a;b--)
               {System.out.print(" ");}
	
	           for (int c=1;c<=a;c++)
               {System.out.print("* ");}
	
	           System.out.println();
               }

              for (int a=1;a<=5;a++)
              {
	          for (int b=5;b>=a;b--)
	          {System.out.print(" ");}
	
	          for (int c=1;c<=a;c++)
	          {System.out.print("* ");}
	
	          System.out.println();
               }
              
      		System.out.println("=======================================================================");
	}

}
