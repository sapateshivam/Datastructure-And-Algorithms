package Datastructure.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDisk = sc.nextInt();
        String tower1 = "tower1"; //source tower
        String tower2 = "tower2"; //destination tower
        String tower3=  "tower3"; //support tower
        towerOfHanoi(numDisk, tower1,tower2,tower3);
    }

    public static void towerOfHanoi(int numDisk, String tower1, String tower2, String tower3){
        if(numDisk==0){
            return;
        }
        towerOfHanoi(numDisk-1, tower1, tower3, tower2);
        System.out.println(numDisk +" ["+tower1+" -> "+tower2+"]");
        towerOfHanoi(numDisk -1, tower3, tower2, tower1);
    }
}
