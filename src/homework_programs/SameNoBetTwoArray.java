package homework_programs;

public class SameNoBetTwoArray
{
public static void main(String[] args)
{
	

	int A[]= {1,2,2,3,2,3,3};
	int B[]= {2,3,4};
	//OutPut=2,3
	for(int i:A)
	{
		for(int j:B)
		{
		    if(i==j)
			{
				//System.out.println(i);
			}
		}
	}
    
	

}
}
