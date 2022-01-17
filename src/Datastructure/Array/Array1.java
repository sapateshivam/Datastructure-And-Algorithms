package Datastructure.Array;

import java.util.Scanner;

public class Array1 {

    public static int[][] create2DArray(){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[] takeInput() {
        System.out.println("Enter array size");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // taking user input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    

    public static void display(int arr[]){
        System.out.println("array elements are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 
    }

    public static int largest(int arr[]){
        int large = arr[0];
        for (int i : arr) {
            if(i>large){
                large=i;
            }
        }
        return large;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        // display(arr);
        System.out.println("Largest value in array is :"+ largest(arr));
        int arr2D[][] = create2DArray();
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[1].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }

    }
}
