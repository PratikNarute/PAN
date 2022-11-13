package automation_lectures;

public class Constructor
{
static int a=10;
float b=20.00f;
short c=30;

  Constructor()     //without argument 
  {
	System.out.println(a);
  }
 
	              
 //  with argument
 Constructor(int c1)                     // Method overloading constructors
 {
	System.out.println(b);
 }
 
 Constructor(int c3,double c4)
 {
	 System.out.println(c); 
 }
 
 
       public static void main(String[] ars)
     {
	 
	    new Constructor();                 // constructor recalling
	    new Constructor(1);
    	new Constructor(10,10.00);
    	 
	 
     }
}
