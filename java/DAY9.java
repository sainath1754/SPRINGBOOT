package com.springbootlearning.com;
import java.util.*;
public class DAY9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("static array implementation");
		System.out.print("enter size of array: ");
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<a.length;i++) 
		{	
		System.out.print("enter "+(i+1)+"st element: ");
		a[i]=sc.nextInt();
		}
		
		System.out.print("elements in array are: ");
		for(int i=0;i<a.length;i++) 
		{	
		System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println("*".repeat(25));
		
		System.out.println("Dynamic array implementation");
		List<Integer> l = new ArrayList<>();
		System.out.println("initial array length is "+l.size());
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("elemnets in array are ");
		for(Integer x:l) {System.out.println(x);}
		System.out.println("array length is "+l.size());
		
	sc.close();
	}
}
