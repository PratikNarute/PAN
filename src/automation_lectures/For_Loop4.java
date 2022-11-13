package automation_lectures;

public class For_Loop4 
{
public static void main(String[] args)
{
	int a,b,c;
	
   // equilateral triangle

/*           *
 *          * *
 *         * * *
 *        * * * *
 *       * * * * *
 *        * * * *
 *         * * *
 *          * *
 *           *
 */

   for (a=1;a<=5;a++)  // a=
 {
	for ( b=5;b>a;b--)
	{System.out.print(" ");}
	
	for (c=1;c<=a;c++)
	{System.out.print("* ");}
	
   System.out.println();		
 }
	
  for (a=1;a<=4;a++)  //a=
 {
	for (b=1;b<=a;b++)
	System.out.print(" ");
	
	for (c=a;c<=4;c++)
	System.out.print("* ");
	
	System.out.println();
 }
  
  System.out.println("------------------------------------------------");
  
/*              *
 *             ***
 *            *****
 *           *******
 *          *********
 *           *******
 *            *****
 *             ***
 *              *                       
 */

  for (a=1;a<=5;a++)  //a=2
  {
	  for(b=5;b>a;b--)
	  {System.out.print(" ");}
	  
	  for (c=1;c<=(2*a-1);c++)
	  {System.out.print("*");} 
	  
	  System.out.println();
  }
  
 for (a=4;a>=1;a--)    //a=2
 {
	 for (b=4;b>(a-1);b--)
	 {System.out.print(" ");}
	 
	 for (c=(2*a-1);c>=1;c--)
	 {System.out.print("*");}
	 
	 System.out.println();
 }
 
 System.out.println("------------------------------------------");
 
 
/*         Right Angle Triangle
 *            * *
 *           ** **
 *          *** ***
 *         **** ****
 *        ***** *****
 *         **** ****
 *          *** ***
 *           ** ** 
 *            * *
 */
 
 for (a=1;a<=5;a++)
 {
	for (b=5;b>a;b--)
    {System.out.print(" ");}
	
	for (c=1;c<=a;c++)
    {System.out.print("*");}
	
	System.out.println();
 }
 

 for (a=4;a>=1;a--)
	 
  {
	 for (b=4;b>(a-1);b--)
	 {System.out.print(" ");}
	 
	 for (c=a;c>=1;c--)
	 {System.out.print("*");}
	 
	 System.out.println();
 }
 
 

 System.out.println("-----------------------------------------------");
  
}	
}
