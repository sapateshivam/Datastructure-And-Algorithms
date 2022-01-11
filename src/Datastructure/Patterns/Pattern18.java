package Datastructure.Patterns;

import java.util.Scanner;

/*
	1
   121
  12321
 1234321
123454321

*/
public class Pattern18 {
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int space =1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		pattern(sc.nextInt());
	}
	
	
}
