package com.kn.patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=5;j++) {
			   if(i==j||i+j==n+1) {
				   System.out.print("1");
			   }else {
				   System.out.print("0");
			   }
		   }System.out.println();
	   }

	}

}
