//Given an array of integers 'a', move all the even integers at the
//beginning of the array followed by all the odd integers. The
//relative order of odd or even integers does not matter. Return
//any array that satisfies the condition.

package _8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _23_SortEvenAndOdd {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortByEvenOdd(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right){
            if(arr[left]%2 == 1 && arr[right]%2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] %2 == 0){
                left++;
            }
            if(arr[right] %2 == 1){
                right--;
            }
        }

//        System.out.println(left);
//        System.out.println(right);

        // to make it sorted
        // Step 2: Sorting even and odd parts separately
        int partitionIndex = left; // This is where odd numbers start
        Arrays.sort(arr, 0, partitionIndex); // Sort even numbers
        Arrays.sort(arr, partitionIndex, arr.length); // Sort odd numbers
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements: ");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        sortByEvenOdd(arr);
        System.out.println("Sorted by Even Odd order:");
        printArray(arr);
    }
}
