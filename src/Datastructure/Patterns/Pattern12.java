package Datastructure.Patterns;

import java.util.Scanner;

/*
ABCDE
FGHIJ
KLMNO
PQRST
UVWXY

*/
public class Pattern12 {
	public static void pattern(int n) {
	 	int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+count-1));
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern(sc.nextInt());
	}
}
