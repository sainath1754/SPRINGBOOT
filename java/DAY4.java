package com.springbootlearning.com;
import java.util.Scanner;
public class DAY4 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a: ");
	int a = sc.nextInt();
	System.out.println("enter b: ");
	float b = sc.nextFloat();
	System.out.println("arithmetic operations");
	
	System.out.println("sum = "+(a+(int)b));
	System.out.println("sub = "+(a-(int)b));
	System.out.println("mul = "+(a*(int)b));
	
	
	System.out.println("urinary operations");
	System.out.println((a--)+(int)b);
	System.out.println((--a)+(int)b);
	
	System.out.println("assignment operations");
	System.out.println(a==(int)b);
	System.out.println(a+=1);
	
	
	System.out.println("relation operations");
	System.out.println(a!=(int)b);
	System.out.println(a>=(int)b);
	System.out.println(a<=(int)b);
	
	int c=4;
	int d=2;
	System.out.println("bitwise operations");
	System.out.println("and "+(c&d));
	System.out.println("or "+(c|d));
	
	System.out.println("terenery operations");
	int maxi =(c>d)?c:d;
	System.out.println("maxi "+maxi);
	
	System.out.println("logical operations");
	System.out.println((c>d)&&(c<d));
	System.out.println((c>d)||(c<d));
	
	
	sc.close();
	}
}
