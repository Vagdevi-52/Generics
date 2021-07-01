package generics;

public class PrintArray
{
	public static < T > void printArray( T[] inputArray )
	{
	      
	      for(T element : inputArray)
	      {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	 }

	   public static void main(String args[])
	   {
	      
	      Integer[] intArray = { 1, 2, 3, 4, 5,6,7 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 ,5.5,6.6,7.7 };
	      Character[] charArray = { 'h', 'e', 'l', 'l', 'o' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
}	   
	   
	   