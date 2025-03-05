package _8_Arrays;

import java.util.Scanner;

public class _26_PrefixSumWithQuerries {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[1] = arr[1];

        for(int i=2; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

//    static int findSum(int[] arr, int r){
//        return arr[r];
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];

        for (int i = 1; i <= size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nPrinting Original Array: ");
        printArray(arr);

        System.out.print("\nEnter number of querries: ");
        int q = sc.nextInt();
        int[] pref = makePrefixSum(arr);

        while (q > 0){
            System.out.print("\nEnter starting index(left): ");
            int l = sc.nextInt();
            System.out.print("Enter ending index(right): ");
            int r = sc.nextInt();

            int res = pref[r] - pref[l-1];

            System.out.println("\nSum is: "+ res);
            q--;
        }
    }
}
