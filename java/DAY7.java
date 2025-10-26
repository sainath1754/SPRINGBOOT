package com.springbootlearning.com;
import java.util.Scanner;
public class DAY7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAY7 d = new DAY7();
		d.hello();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		int ans = d.multiply(a,b);
		System.out.print("multiplied : "+ans);
		sc.close();
	}
	void hello() {
		System.out.println("hi hello namaste");
	}
	
	int multiply(int c,int d) {
		int x = c*d;
		return x;
	}
}
