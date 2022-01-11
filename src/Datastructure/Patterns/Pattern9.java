package Datastructure.Patterns;

import java.util.Scanner;

/*
1
2 1
3 2 1
4 3 2 1
*/

public class Pattern9 {
	
	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1);
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
