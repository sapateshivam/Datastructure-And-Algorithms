package Datastructure.Recursion;

import java.util.Scanner;


public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i] =  sc.nextInt();
        }     
        System.out.println(maxOfArray(arr, 0));
        System.out.println(minOfArray(arr, 0));    
    }



    public static int maxOfArray(int arr[],int index){
        if(index>=arr.length){
            return arr[index-1];
        }
        int maxOfSubArray =  maxOfArray(arr, index+1);
        if(maxOfSubArray>arr[index])
            return maxOfSubArray;
        else 
            return arr[index];
    }

    public static int minOfArray(int arr[],int index){
        if(index>=arr.length){
            return arr[index-1];
        }
        int minOfSubArray =  minOfArray(arr, index+1);
        if(minOfSubArray<arr[index])
            return minOfSubArray;
        else 
            return arr[index];
    }
}
