package com.springbootlearning.com;
import java.util.Scanner;
public class DAY5 {
	public static void main(String[] args) 
	{
		int i=5;
		int j=2;
		if (i<j) 
		{
			System.out.println(i+" is less than "+j);
		}
		else if (i>j) 
		{
			System.out.println(i+" is greater than "+j);
		}
		else
		{
			System.out.println(i+" is equal to "+j);
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num (0 or 1): ");
		int a = sc.nextInt();
		switch(a) 
		{
		case 0:
			System.out.println("case 0 is executed");
			break;
		case 1:
			System.out.println("case 1 is executed");
			break;
		default:
			System.out.println("default is executed");
			break;
		}
		sc.close();
	}
}
