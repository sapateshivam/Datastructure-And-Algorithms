package Datastructure.Recursion;

import java.util.Scanner;

public class PrintIncreseDecrease {
    
    public static void printIncreseDecrease(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        printIncreseDecrease(num - 1);
        System.out.println(num);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printIncreseDecrease(sc.nextInt());
        
    }   
}
