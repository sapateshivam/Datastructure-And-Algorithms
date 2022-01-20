package Datastructure.Recursion;

import java.util.Scanner;
//print decermented value upto 1
public class Decrement {
    public static int decrement (int num) {
        if(num==0){
            return 0;
        }
        System.out.println(num);
        return decrement(num-1);  
    }

    public static int sumAllElements(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sumAllElements(n - 1) ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumAllElements(num)); 

    }
    
}
