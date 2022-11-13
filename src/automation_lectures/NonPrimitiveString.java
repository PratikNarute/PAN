package automation_lectures;

public class NonPrimitiveString 
{
    public static void main(String[] args)
    {
		
		  String a="Pratik";    // by using literal [location decide depend on variable value]
		  String b="Pratik";
		
		  
		  String c=new String("Narute");  //by using object [location decide depend on variable]
		  String d= new String("Narute");
		  
		  // Memory location comparision is depend on variable/variable value
		  System.out.println(a==b);
		  System.out.println(c==d);
		  
		  b="pratik";
		  System.out.println(a==b);
		  System.out.println("============================================================");
		  
		  // equal data comparision
		  System.out.println(c.equals(d));
		  System.out.println("============================================================");  
		  
		  // equalIngnoreCase [data comparision by ignoring case]
		  String e="Pratik";
		  String e1="praTik";
		  System.out.println(e.equalsIgnoreCase(e1));
		  System.out.println("============================================================");
		  
		  //toUpperCase() [To convert data in uppercase]
		  System.out.println(e.toUpperCase());
		  String e2=e.toUpperCase();
		  System.out.println(e2);
		  System.out.println("============================================================");
		  
		  //toLowerCase() [To convert data into lower case]
		  System.out.println(e.toLowerCase());
		  String e3=e.toLowerCase();
		  System.out.println(e3);
		  System.out.println("============================================================");
		  
		  // indexOf(' ')
		  String f="Pratik Narute";
		  int index =f.indexOf('t');
		  System.out.println(f.indexOf('t'));
		  System.out.println(index);
		  
		  // lastIndexOf(' ')
		  index =f.lastIndexOf('t');
		  System.out.println(f.lastIndexOf('t'));
		  System.out.println(index);
		  System.out.println("============================================================");
		  
		  // charAt (Index) 
		  char x=f.charAt(5);
		  System.out.println(f.charAt(5));
		  System.out.println(x);
		  System.out.println("============================================================");
		  
		  //length() 
		  System.out.println(f.length());
		  System.out.println("============================================================");
		  
		  //startWith (" ")
		  boolean y=f.startsWith("Pra");
		  System.out.println(y);
		  
		  //endWith (" ")
		  boolean y1=f.endsWith("te");
		  System.out.println(y1);
		  System.out.println("============================================================");
		  
		  // substring [Overloaded]
		  System.out.println(f.substring(1));
		  System.out.println(f.substring(7,13));
		  System.out.println("============================================================");
		  
		  // trim ()
		  String z=" Pratik Narute ";
		  System.out.println(z);
		  System.out.println(z.trim());
		  System.out.println("============================================================");
		  
		  // concat (world)
		  System.out.println(a.concat(c));
		  System.out.println(a.concat(" Narute").concat(z));
		  z=a+d;
		  System.out.println(z);
		  System.out.println("============================================================");
		  
		  // split (" ") [ used to split index]
		  String c1="Pratik Pandurang Narute";
		  String [] x1=c1.split(" ");
		  
		  System.out.println(x1[0]); 
		  System.out.println(x1[1]);
		  System.out.println(x1[2]);
		  System.out.println("============================================================");
		  
				  
		  
		  
		
		  
	}
}
