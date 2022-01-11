package Datastructure.Patterns;

import java.util.Scanner;

/*ABCDE
ABCDE
ABCDE
ABCDE
ABCDE*/

public class Pattern11 {

	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern(sc.nextInt());
	}
}
