package Datastructure.Patterns;

import java.util.Scanner;

/*
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI

*/
public class Pattern13 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			int count=i;
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+count-1));
				count++;
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+i+j-2));
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		pattern(sc.nextInt());
		pattern2(sc.nextInt());

	}
}
