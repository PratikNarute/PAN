package static_nonStatic;

public class Pro 
{
static int a=10;  //static variable
int b=20;  //non static variable/instance variable


    public static void StaticMethod()  //static method
    {System.out.println("Pro-this is static method");}

	
	public void NonStaticMethod()  //non static method
	{System.out.println("Pro-this is non static method");}
	
	
	public static void main(String[] args)
	{
	
		System.out.println(a); //calling static variable
		Pro.StaticMethod();    // calling static method
		
		
		
System.out.println("======================================================");
		
		
		
		Pro x= new Pro();             //object
		
		System.out.println(x.b);     //calling non static variable
		
		x.NonStaticMethod();       //calling non static method
		
		x.a=30;                   //calling changed static variable
		System.out.println(x.a);
		System.out.println(x.a);
		x.a=40;
		System.out.println(x.a);
		System.out.println(x.a);
		
		x.b=50;                  //calling changed non static variable
		System.out.println(x.b);
		System.out.println(x.b);
		x.b=60;
		System.out.println(x.b);
		System.out.println(x.b);
		
	
		
System.out.println("======================================================");

        Noob y=new Noob();
        y.NonStaticMethod();
        System.out.println(y.c);
       
		
	}
}
