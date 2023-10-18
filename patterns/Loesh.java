package com.kn.patterns;

import java.util.Scanner;

public class Loesh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 
		 
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 if(j==1||(i==5&&j<=3)) {
					
					 System.out.print("*"+" ");
				 }
			 }System.out.println(); 
		 }

		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 if(j==1||i==1||i==n||j==n) {
					 System.out.print("*");
				 }else{
					 System.out.print(" ");
				 }
			 }System.out.println();
		 }
	}
		 }
		
		 
		 
		 
		 
		 
	


