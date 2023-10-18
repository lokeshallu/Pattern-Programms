package com.kn.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num =scan.nextInt();
		int k=0;
		for(int i=0;i<=2*num;i++) {
			int totalrows = i>num ? 2*num - i:i;
			
			for(int j=0;j<=totalrows;j++) {
				System.out.print("*");
			}System.out.print("");
			System.out.println("");
		}

	}

}
