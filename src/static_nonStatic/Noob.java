package static_nonStatic;

public class Noob 
{
static int c=110;  //static variable
int d=120;         //non static variable


  public static void StaticMethod()   //static method
  {System.out.println("Noob-this is a static method");}
	
  public void NonStaticMethod()      //non static method
  {System.out.println("Noob-this is non static method");}
	
  
    public static void main(String[] args)
    {
	 
      System.out.println(c);   //calling static variable
	  Noob.StaticMethod();     // calling static method
	  Pro.StaticMethod();      // calling static method from another class
	  
 System.out.println("=================================================");
	  
	  Noob y=new Noob();         //object
	  
      System.out.println(y.d);    //calling non static variable
      y.NonStaticMethod();        //calling non static method
	  
      y.c=130;                    //calling changed static variable
      System.out.println(y.c);
      System.out.println(y.c);
	  
	  y.d=140;                   //calling changed non static variable
	  System.out.println(y.d);
	  System.out.println(y.d);
	  
	  
 System.out.println("=================================================");  
	  
	  
	 Pro x=new Pro();          //object creation from another class
	  
	 System.out.println(x.a);  //calling static variable from another class
	 System.out.println(x.b);  //calling non static variable from another class
     x.NonStaticMethod();      //calling non static method from another class
	 
	  
   }	
}
