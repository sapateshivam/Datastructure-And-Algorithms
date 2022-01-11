package Datastructure.Patterns;

import java.util.Scanner;

/*3 2 1
3 2 1 
3 2 1
*/
public class Pattern5 {
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((n-j+1)+" ");
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
