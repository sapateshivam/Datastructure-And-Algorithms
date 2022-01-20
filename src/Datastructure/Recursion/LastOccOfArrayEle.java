package Datastructure.Recursion;

import java.util.Scanner;

public class LastOccOfArrayEle {
    public static int lastOccuranceOfArrayElement(int arr[], int index,int num){
        if(index==arr.length){
            return -1;
        }
        
        int maxIndex = lastOccuranceOfArrayElement(arr, index-1, num);
        if(arr[index]==num){
            if(maxIndex>index)
                return maxIndex;
            else 
                return index;
        }else
            return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
    }
}
