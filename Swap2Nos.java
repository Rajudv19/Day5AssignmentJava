package com.BridgeLabs.day5;
import java.util.Scanner;

public class Swap2Nos 
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Values for A and B  ");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("Before Swap " + a + " " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("AFTER Swap  " + a + " "+ b);
	}
}
