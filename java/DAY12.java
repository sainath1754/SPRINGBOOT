package com.springbootlearning.com;
import java.util.*;
public class DAY12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String a = sc.nextLine(); 
		String parts[] = a.split(" ");
		System.out.println("\n--- Words in the Sentence ---");
		for(String p : parts) {
			if (!p.isEmpty()) { 
				System.out.println(p);
			}
		}
		
		System.out.println("-----------------------------");
		System.out.println("Original sentence: " + a);
		System.out.println("Trimmed sentence: " + a.trim());
		
		sc.close();
	}

}
