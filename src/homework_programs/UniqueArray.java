package homework_programs;

public class UniqueArray 
{

	// This logic is applicable for continue number in sequence order like {1,1,2,2}
	
	public static void main(String[] args)
	{
		int arr[] = {3,3,1,2,2,4};
	
		int ans;
		int i=0; 
		
		for(int j=1;j<arr.length;j++) 
		{
			if(arr[i]!=arr[j]) // 
			{
				i++; //2
				arr[i] = arr[j];
			}
		}
		 
		ans = i + 1; // 3
		
		for(int k = 0;k<=i;k++) 
		{
			System.out.println(arr[k]);
		}
		
	}
	

}
