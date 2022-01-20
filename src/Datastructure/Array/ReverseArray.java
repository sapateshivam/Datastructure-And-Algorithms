package Datastructure.Array;

import java.util.Scanner;

public class ReverseArray {

    public void printArrayele(int[] arr){
        System.out.println("Array elements are :");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public int[] reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the Arrry elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ReverseArray obj =  new ReverseArray();
        obj.printArrayele(arr);
        int[] reverseArrar =  obj.reverseArray(arr, 0, arr.length-1);
        obj.printArrayele(reverseArrar);


    }
}
