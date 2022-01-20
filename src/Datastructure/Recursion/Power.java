package Datastructure.Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int index = sc.nextInt();
        System.out.println(power(num, index));
    }
    public static int power(int num, int index){
        if(index==0){
            return 1;
        }else{
            return num * power( num, index -1);
        }

    }
}
