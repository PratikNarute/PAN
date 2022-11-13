package homework_programs;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		// Panlindrome Number
		// 454 = 4 5
      int a,sum=0,n=454,N=n;
      
      while (n>0) //4
      {
    	  a=n%10; //4
    	  sum = (sum*10) + a; // 
    	  n=n/10; 
      }
    
      if (sum==N)
      {
    	  System.out.println("Palindrome Number");
      }
      else
      {
    	  System.out.println("Not Palindrome Number");
      }
      
      
    System.out.println("************************************");
    
    
       // Palindrome Number by using Array
    
//    int b[]= {1,2,3,1};
//
//    int i,j;
//
//      for ( i=0;i<b.length;i++)
//      {
//    
//    	  System.out.print(b[i]);
//    	  
//      }
//      
//      
//      for( j=b.length-1;j>=0;j--)
//      {
//   
//    	  System.out.print(b[j]);
//    	
//      }
//      
//      
//      if (b[i]==b[j])
//      {
//    	  System.out.println("palindrome number");
//      }
//      else
//      {
//    	  System.out.println("not polindrome nubmer");
//      }
//      
     

}
}