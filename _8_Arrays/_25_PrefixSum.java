package _8_Arrays;

import java.util.Scanner;

public class _25_PrefixSum {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Prefix sum in new array
    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    // Prefix sum in same array
    static int[] makePrefixSumInSameArray(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing Original Array: ");
        printArray(arr);

        System.out.println("\nPrefix Sum of Array:");
        int[] pref = makePrefixSum(arr);
        printArray(pref);

        System.out.println("\nPrefix sum in OG array:");
        makePrefixSumInSameArray(arr);
        printArray(arr);
    }
}