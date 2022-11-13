package homework_programs;

public class ArrayMaxMinNumber 
{
	public static void main(String[] args)
	{
		//max no array
		int a []= {15,2,5,50,70,65};  
		int max =0;
		for (int i=0;i<=a.length-1;i++)  // i=5
		{
			if (max<=a[i])  //70<=65
			{
				max=a[i];	// max=70;
			}
		}
		
		System.out.println(max);
		
		
		System.out.println("****************************************");
		
		//min no array
		
		int b []= {15,2,5,50,70,65};
		int min =2;
		for (int i=0;i<b.length;i++)
		{
			if (min>=b[i])
			{
				min=b[i];	
			}
		}
		
		System.out.println(min);	
		
	}
}
