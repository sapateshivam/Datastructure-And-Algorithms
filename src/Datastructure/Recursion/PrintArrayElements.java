package Datastructure.Recursion;

import java.util.Scanner;

public class PrintArrayElements {

    public static void printArrayelements(int arr[],int index){
        if(index<0){
            return;
        }else{
            printArrayelements(arr,index-1);
            System.out.println(arr[index]);
        }
    }

    public static void printReverseArrayName(int arr[], int index) {
        if(index<0)
            return;
        System.out.println(arr[index]);
        printReverseArrayName(arr, index-1);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printArrayelements(arr,arr.length-1);
        printReverseArrayName(arr, arr.length-1);
    }
    
}
