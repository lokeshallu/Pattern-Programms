package com.kn.PatternProgramming;

public class DoubleHillPattern {
	public static void main(String[] args) {
//		int k=0;
//		for(int i=1;i<=7;i++) {
//			if(i<=4) {
//				k++;
//			}else {
//				k--;
//			
//		}for( int j=1;j<=7;j++) {
//			if(j>=(5-k)&&j<=(3+k)) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}System.out.println();
//	}
//	}
//}


/* *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   
*/
      int k=0;
      for(int i=1;i<=9;i++) {
    	  if(i<=5) {
    		  k++;
    	  }else {
    		  k--;
    	  }for( int j=1;j<=5;j++) {
    		  if(j<=k) {
    			  System.out.print("*");
    			  
    		  }else{
    			  System.out.print(" ");
    		  }
    		  
    	  }System.out.println("");
      }
	}
}
/* *        
   **      
   ***    
   ****  
   *****
   ****  
   ***    
   **      
   *    
 */













