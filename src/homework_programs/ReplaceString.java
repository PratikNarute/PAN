package homework_programs;

public class ReplaceString
{

	public static void main(String[] args)
	{
		String a= "pratik tik";
		
		System.out.println(a.replace("tik","nit"));
		System.out.println(a.replaceFirst("tik", "nit"));
		
		System.out.println(a.replaceAll("tik","nit"));
		System.out.println(a.replaceAll("tik(.)","nit"));
		System.out.println(a.replaceAll("tik(.*)","nit"));	
	
	
	}	   

}
