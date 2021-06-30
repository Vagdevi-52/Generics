package generics;

public class PrintArray
{
	public static void main(String[] args)
	{
		String s1 = "choclate";
    	String s2 = "sprite drink";
		String s3 = "biryani";
		if (s1.length() > s2.length() && s1.length() > s3.length())
		System.out.println("Largest String is" +s1);
		else if (s2.length() > s1.length() && s2.length() > s3.length())
		System.out.println("Largest String is " +s2);
		else
		System.out.println("Largest String is " +s3);
	 }
}	