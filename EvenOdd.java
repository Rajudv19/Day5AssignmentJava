package com.BridgeLabs.day5;
import java.util.Scanner;

class EvenOdd 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
	 	System.out.println("Enter Values for A...");
		int a = s.nextInt();

		if (a%2==0)
			System.out.println(a + " is Even No.... ");
		else
			System.out.println(a + " is Odd  No.... ");
	}
}
