package Datastructure.Recursion;

import java.util.Scanner;

public class PrintIncresing {
    public static void printIncresing(int n){
        if(n==0)
            return;
        printIncresing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printIncresing(sc.nextInt());
    }
    
}
