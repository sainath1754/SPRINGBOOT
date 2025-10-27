package com.springbootlearning.com;

public class DAY8 {

	public static void main(String[] args) {
		System.out.println("break condition check");
		for(int i=0;i<5;i++) {
			if (i==2) {break;}
			else{System.out.print(i+" ");}
		}
		System.out.println();
		System.out.println("continue condition check");
		for(int i=0;i<5;i++) {
			if (i==2) {continue;}
			else{System.out.print(i+" ");}
		}

	}

}
