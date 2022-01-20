package Datastructure.Recursion;

import java.util.Scanner;

public class FirstOccOfArrayEle {
    public static int firstOccuranceInArray(int arr[],int index,int num){
        if(index==arr.length)
            return -1;
        int smallIndex = firstOccuranceInArray(arr, index+1,num);
        if(arr[index]==num){
            return index;
        }else
            return smallIndex;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i<arr.length;i++){
            arr[i] =  sc.nextInt();
        }
        System.out.println(firstOccuranceInArray(arr, 0, 3));
    }
}
