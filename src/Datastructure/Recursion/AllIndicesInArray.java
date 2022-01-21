package Datastructure.Recursion;

import java.util.Scanner;


public class AllIndicesInArray {
    public static int[] allIndicesInArray(int[] arr, int index, int num, int count){
        if(index==arr.length){
            return new int[count];
        }
        if(arr[index]==num){
            int ianum [] =allIndicesInArray(arr, index+1, num, count+1);
            ianum[count] = index;
            return ianum;
        }else{
            int ianum [] =allIndicesInArray(arr, index+1, num, count);
            return ianum;
        }


    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int resultarr[] = allIndicesInArray(arr,0,2,0);
        for(int i : resultarr){
            System.out.print(i +" ");
        }
    }
}
