package Datastructure.Patterns;

import java.util.Scanner;

/*
A A A
B B B
C C C
*/
public class Pattern10 {

	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)('A'+i-1));
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
