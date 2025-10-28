package com.springbootlearning.com;
import java.util.*;
public class DAY10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no. of rows: ");
		int r = sc.nextInt();
		System.out.print("enter no. of columns: ");
		int c = sc.nextInt();
		int mat[][]= new int[r][c];
		for(int i=0;i<r;i++) 
		{	
			for(int j=0;j<c;j++)
				{
				System.out.print("enter element at row value "+i+" column value "+j+" -> ");
				mat[i][j]=sc.nextInt();
				}
		}
		
		for(int i=0;i<r;i++) 
		{	
			for(int j=0;j<c;j++)
				{
				System.out.print(mat[i][j] + " ");
				}
			System.out.println();
		}
		
	sc.close();
	}
}
