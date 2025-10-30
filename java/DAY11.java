package com.springbootlearning.com;
import java.util.*;
public class DAY11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string: ");
		String a = sc.next();
		System.out.println("The string entered is "+a);
		System.out.print("enter a index to find the element :");
		System.out.println("The element at index 1 is "+ a.charAt(1));
		System.out.println("length of string is "+a.length());
		System.out.println("converting to uppercase :  " +a.toUpperCase());
		System.out.println("converting to lowercase :  " +a.toLowerCase());
		String sub = a.substring(1,4);
		System.out.println("index of the substring '"+sub+"' is "+a.indexOf(sub));
		System.out.println("main string containing substring '"+sub+"' is "+a.contains(sub));
		System.out.println("main string starts with '"+sub+"' is "+a.startsWith(sub));
		System.out.println("main string ends with '"+sub+"' is "+a.endsWith(sub));
;		String b = new String("SAINADH");
		System.out.println("comparing str1 and str2 : "+a.compareTo(b));
		System.out.println("comparing str1 and str2 (comparing objects): "+(a==b));
		System.out.println("comparing str1 and str2 (with case): "+(a.equals(b)));
		System.out.println("comparing str1 and str2 (ignoring case): "+(a.equalsIgnoreCase(b)));
		System.out.println("concatenation way-1 -->  "+(a+b));
		System.out.println("concatenation way-1 -->  "+(a.concat(b)));
		sc.close();
	}

}
