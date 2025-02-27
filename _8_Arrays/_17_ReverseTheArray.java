package _8_Arrays;

import java.util.Scanner;

public class _17_ReverseTheArray {

    // REVERSE ARRAY AND STORE IN NEW ARRAY
    static int[] reverseArray(int[] arr){
        int size = arr.length;
        int[] ansArr = new int[size];
        int j = 0;

        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=size-1; i>=0; i--){
            ansArr[j++] = arr[i];
        }
        return ansArr;
    }

    // REVERSE THE ARRAY IN SAME ARRAY
    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseSameArray(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }



    static void printArray(int[] ansArr){
        int size = ansArr.length;
        System.out.println("\nPrinting reversed array:");
        for(int i=0; i<size; i++){
            System.out.print(ansArr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        reverseSameArray(arr);
        printArray(arr);
    }
}
