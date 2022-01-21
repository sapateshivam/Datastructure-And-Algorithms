package Datastructure.Recursion;

import java.util.Scanner;

public class LastOccOfArrayEle {
    public static int lastOccuranceOfArrayElement(int arr[], int index, int num) {
        if (index == arr.length) {
            return -1;
        }
        int maxIndex = lastOccuranceOfArrayElement(arr, index + 1, num);
        if(maxIndex==-1){
            if(arr[index]==num){
                return index;
            }else{
                return -1;
            }
        }else{
            return maxIndex;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lastOccuranceOfArrayElement(arr, 0, 3));
    }
}
