package Datastructure.Array;

import java.util.Scanner;

// remove even elements from array

public class RemoveOddElements {

    public void printArrayElements(int[] arr){
        System.out.println("Array elements are : ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public int[] removeEvenElements(int[] arr){
        int evenCount = 0;
        for(int i : arr){
            if(i%2==0){
                evenCount++;
            }
        }    
        int[] evenArray = new int[evenCount];
        int index = 0;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]%2==0){
                evenArray[index] = arr[i];
                index++;
            }
        }
        return evenArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        RemoveOddElements obj = new RemoveOddElements();
        obj.printArrayElements(arr);
        int evenArray[] = obj.removeEvenElements(arr);
        obj.printArrayElements(evenArray);
    }
}
