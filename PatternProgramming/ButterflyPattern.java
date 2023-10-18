package com.kn.PatternProgramming;

public class ButterflyPattern {
	public static void main(String[] args) {
//		int k=0;
//		for(int i=1;i<=9;i++) {
//		   if(i<=5) {
//			   k++;
//		   }else {
//			   k--;
//		   }
//			for(int j=1;j<=9;j++) {
//				if(j<=k || j>=(10-k)) {
//					System.out.print("*");
//				}else{
//					System.out.print(" ");
//				}
//			}System.out.println("");
//		}
//	}
//
//}
/*
*       *       
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *
 * 
 */



//		
//	int k=0;
//	for(int i=1;i<=7;i++) {
//		if(i<=4) {
//			k++;
//		}else {
//			k--;
//		}
//	
//		for(int j =1;j<=7;j++) {
//			if( j>=k && j<=(8-k)) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}System.out.println("");
//	}
//}
//}
/*
*******
 ***** 
  ***  
   *   
  ***  
 ***** 
*******
 * 		
 */
	
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		
	
		if(j%2 ==0) {
			
			System.out.print("0");
		}else {
			System.out.print("1");
		}
	}System.out.println("");
}}
}
/*
1
10
101
1010
10101
 * 
 * 
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
