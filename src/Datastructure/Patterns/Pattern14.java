package Datastructure.Patterns;

import java.util.Scanner;

/*
A
BB
CCC
DDDD
EEEEE
*/

public class Pattern14 {
	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A'+i-1));
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern(sc.nextInt());
	}

}
