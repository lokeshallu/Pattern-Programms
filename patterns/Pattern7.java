package com.kn.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    
	    for(int i=num;i>0;i--) {
	    	for(int j=0;j<=i;j++) {
	    		if(j!=0) {
	    			System.out.print("*");
	    		}else {
	    			System.out.print(i);
	    		}
	    	}System.out.println();
	    }

	}

}
