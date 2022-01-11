package Datastructure.BitManipulation;

import java.util.Scanner;

public class BitManipulation {
	
	public void evenOdd() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number "); 
		int num = sc.nextInt();
		int res = num&1;
		System.err.println(Integer.toBinaryString(num));
		if(res==0) 
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

	}
	
	
	public void findithBit() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number "); 
		int num = sc.nextInt();
		System.out.println("Enter postion to find bit :");
		int i = sc.nextInt();
		int res = num & (1<<i);
		if(res==0) {
			System.out.println("Bit is 0");
		}else {
			System.out.println("Bit is 1");
		}
	}
	
	
	public static void main(String args[]) {
		BitManipulation bm = new BitManipulation();
		bm.findithBit();
		bm.evenOdd();
		
	}
}
