//Array

import java.util.Scanner;
class ArrayDemo
{
	public static void main(String args[])
	{
	
		Scanner myobj = new Scanner(System.in); //for createing object
		System.out.println("Enter the size of array : ");
		int size = myobj.nextInt();
		

		int[] numbers = new int[size];

		System.out.println("Elements of the array: ");
		for(int i = 0 ; i<numbers.length;i++)
		{
			
			System.out.println("Element at index  " + i + ":" );
			numbers[i] = myobj.nextInt();

		}

		System.out.println("Elements of the array: ");
		for(int i = 0 ; i<numbers.length;i++)
		{
			System.out.println("Element at index  " + i + ":"  + numbers[i]);
		}
		
 	}
}