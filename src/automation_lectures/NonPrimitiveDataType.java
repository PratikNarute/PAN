package automation_lectures;

public class NonPrimitiveDataType 
{
	                      //syntax of Array
	
	/*      (data type)  (variable name) []= {v1,v2....vn}
	 * 
	 *      (data type) [] (variable name)= {v1,v2....vn}
	 */
	
	public static void main(String[] args)
	{
		
		
		// Array declaration and initilisation at samae level
		
/*             syntax of Array
*      (data type)  (variable name) []= {v1,v2....vn}
*      (data type) [] (variable name)= {v1,v2....vn}
*/
		
     	int a []= {1,2,3,4,5};               // {v1,v2,v3,v4,v5}  == variable values/size/lenght
		//System.out.println(a[0]);           //   0  1  2  3  4   == index
		//a[2]=10;
		//System.out.println(a[2]);
     	
     	
    	String c[]= {"pratik","narute"};
		//System.out.println(c[1]);
		
		
		char b[]= {'a','b','c','d','e'};
		//System.out.println(b[3]);
		
		//int size=b.length;
		//System.out.println(size);
		
		   int u;
		  for( u=0;u<a.length;u++) 
		  {
			  System.out.println(a[u]);
		  }
		   
		    u=0;
		   while (u<b.length)
		   {
		   System.out.println(b[u]);
		   u++;
		   }
	
	
		
System.out.println("****************************************************************");


		
		// Array declaration and initilisation at separate level
		
		//  (data type) (varible ref name) []= new (data type)[size]
		
		int x []=new int [5];
		 x[0]= 10;
		 x[1]=20;
		 x[2]=30;
		 x[3]=40;
		 x[4]=50;
		 System.out.println(x[0]);
		
		

System.out.println("****************************************************************");	
	

        

 



	}
	
	
}
