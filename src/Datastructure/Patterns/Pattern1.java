package Datastructure.Patterns;

/*1 1 1 1
2 2 2 2 
3 3 3 3 
4 4 4 4
*/

public class Pattern1 {

	public static void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(5);
	}

}
