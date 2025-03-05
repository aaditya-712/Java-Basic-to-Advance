<<<<<<< HEAD
package _8_Arrays;

import java.util.Scanner;

public class _18_RotateArray {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void printArray(int[] ansArr){
        int size = ansArr.length;
        System.out.println("\nPrinting array:");
        for(int i=0; i<size; i++){
            System.out.print(ansArr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        int[] ans = rotate(arr, k);
        System.out.println("Rotated Array:");
        printArray(ans);

    }
}
=======
package _8_Arrays;

import java.util.Scanner;

public class _18_RotateArray {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i=n-k; i<n; i++){
            ans[j++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    static void printArray(int[] ansArr){
        int size = ansArr.length;
        System.out.println("\nPrinting array:");
        for(int i=0; i<size; i++){
            System.out.print(ansArr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        int[] ans = rotate(arr, k);
        System.out.println("Rotated Array:");
        printArray(ans);

    }
}
>>>>>>> 0bea72e (Prefix and Suffix Sum)
