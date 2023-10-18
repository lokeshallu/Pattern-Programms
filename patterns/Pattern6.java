package com.kn.patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	  int num = scan.nextInt();
	  for(int i=0;i<=2*num;i++) {
		  int totalrows = i>num ? 2*num -i:i;
		  
		 int  spaces =num-totalrows;
		 for(int k=0;k<=spaces;k++) {
			 System.out.print(" ");
		 }
		     for(int j=0;j<=totalrows;j++) {
		    	 System.out.print("* ");
		     }System.out.println("");
	  }

	}

}
