package com.kn.PatternProgramming;

public class TriangleT2 {
	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j>=i) {
//					System.out.print((char)(70-i) );
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println("");
//		}
//	}}
/*
 *    EEEEE
       DDDD
        CCC
         BB
          A
 */

//
//
//	for(int i=5;i>=1;i--) {
//		for(int j=1;j<=5;j++) {
//			if(j<=i) {
//				System.out.print(j );
//			}else {
//				System.out.print(" ");
//			}
//		}System.out.println("");
//	}
//}
//
//}

/*
 * 
12345
1234 
123  
12   
1    
 */
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if((i+j)>=6) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println("");
//		}
//	}
//
//	}

/*
 *  *
   **
  ***
 ****
*****
 */
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=9;j++) {
//				if((j>=(6-i))&&((j<=(4+i)))) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println("");
//		}
//	}
//
//	}
/*  *    
   ***   
  *****  
 ******* 
**********/		
	

//for(int i=1;i<=5;i++) {
//	for(int j=1;j<=9;j++) {
//		if((j<=(6-i))||((j>=(4+i)))) {
//			System.out.print("*");
//		}else {
//			System.out.print(" ");
//		}
//	}System.out.println("");
//}
//}
//
//}

/*
 
 **********
**** ****
***   ***
**     **
*       *
  	
 */
		int k;
		for(int i=1;i<=5;i++) {
			k=1;
		for(int j=1;j<=9;j++) {
			if(j>=(6-i)&&j<=(4+i) && k==1) {
			
				System.out.print("*");
				k=0;
			}else {
				System.out.print(" ");
				k=1;
			}
		}System.out.println("");
	}
	}
	
	}
/*
 *  *    
   * *   
  * * *  
 * * * * 
* * * * *
 */
		
	

		
		
		
		
		
		
		
		
		
