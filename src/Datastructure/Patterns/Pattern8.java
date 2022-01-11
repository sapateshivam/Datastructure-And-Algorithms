package Datastructure.Patterns;

import java.util.Scanner;

/*
1
2 3
3 4 5 
4 5 6 7
*/
public class Pattern8 {
	
	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			int count = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(count+" ");
				count++;
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
