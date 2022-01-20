package Datastructure.Array;

import java.util.Scanner;

public class MinOfArray {

    public void minElementOfArray(int[] arr){
        System.out.println("Minimum : ");
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public void secondMin(int[] arr){
        int min = arr[0];
        int preMin = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                preMin = min;
                min = arr[i];
            }
        }
        System.out.println(preMin);
    }

    public void printArrayElements(int[] arr){
        System.out.println("Array elements are : ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        MinOfArray obj = new MinOfArray();
        obj.printArrayElements(arr);
        obj.secondMin(arr);
    }
}
