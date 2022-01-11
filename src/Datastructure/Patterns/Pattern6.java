package Datastructure.Patterns;

import java.util.Scanner;

/*
pattern -
*
**
***
****

*/
public class Pattern6 {

	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}
}
