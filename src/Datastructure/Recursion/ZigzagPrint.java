package Datastructure.Recursion;

import java.util.Scanner;

public class ZigzagPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zigzagprint(n);
    }
    public static void zigzagprint(int n){
        if(n==0){
            return;
        }
        System.out.println("Pre - "+n);
        zigzagprint(n-1);
        System.out.println("In - "+n);
        zigzagprint(n-1);
        System.out.println("Post - "+n);
    }
}
