package Datastructure.Patterns;

import java.util.Scanner;

/*
*  *  *  *  *     
*  *  *  *    
*  *  *   
*  *  
* 

*/
public class Pattern17 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" * ");
			}
			
			for(int space = 1;space<=n-i;space++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern(sc.nextInt());
	}
	
}
