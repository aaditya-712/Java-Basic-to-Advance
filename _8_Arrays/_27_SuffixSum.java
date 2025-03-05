package _8_Arrays;

import java.util.Scanner;

public class _27_SuffixSum {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] suffixSumArray(int[] arr){
        int n = arr.length;
        int[] suf = new int[n];
        suf[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            suf[i] = suf[i+1] + arr[i];
        }
        return suf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nPrinting Original Array: ");
        printArray(arr);

        System.out.println("\nSuffix Sum Array: ");
        int[] suff = suffixSumArray(arr);
        printArray(suff);
    }
}
