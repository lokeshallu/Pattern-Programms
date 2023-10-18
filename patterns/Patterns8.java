package com.kn.patterns;

import java.util.Scanner;

public class Patterns8 {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(i==j||i+j==n+1) {
					System.out.print(j);
					System.out.print(" ");
					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
