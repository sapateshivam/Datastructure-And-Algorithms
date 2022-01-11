package Datastructure.Patterns;

import java.util.Scanner;

/*
1
2 2
3 3 3
4 4 4 4

*/
public class Pattern7 {
	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
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
