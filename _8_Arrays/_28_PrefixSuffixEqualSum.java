package _8_Arrays;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class _28_PrefixSuffixEqualSum {

    static void printArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];

        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }

    static int[] suffixSum(int[] arr){
        int n = arr.length;
        int[] suff = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
    }

    static void checkEqual(int[] pref, int[] suff){
        int n = pref.length;
        for(int i=0; i<n-1; i++){
            if(pref[i] == suff[i+1]) {
                System.out.println("\nEqual Sum is: " + pref[i]);
                System.out.println("Index of Prefix: " + i);
                System.out.println("Index of Suffix: " + (i + 1));
                break;
            }
        }
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

        int[] pref = prefixSum(arr);
        int[] suff = suffixSum(arr);

        System.out.println("\nPrefix Sum of Array:");
        printArray(pref);
        System.out.println("\nSuffix Sum of Array:");
        printArray(suff);

        // to check if PREFIX & SUFFIX sum gets equal
        checkEqual(pref, suff);

    }
}
