<<<<<<< HEAD
package _8_Arrays;

import java.util.Scanner;

public class _19_RotateInPlace {

    static void reverseArray(int[] arr, int i, int j){
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n-k-1); // reversing first part
        reverseArray(arr, n-k, n-1); // reversing second part
        reverseArray(arr, 0, n-1);   // reversing whole array

        return arr;
    }

    static void printArray(int[] ansArr){
        int size = ansArr.length;
//        System.out.println("\nPrinting array:");
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

        System.out.println("Rotated Array:");
        printArray(rotateInPlace(arr, k));

    }
}
=======
package _8_Arrays;

import java.util.Scanner;

public class _19_RotateInPlace {

    static void reverseArray(int[] arr, int i, int j){
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n-k-1); // reversing first part
        reverseArray(arr, n-k, n-1); // reversing second part
        reverseArray(arr, 0, n-1);   // reversing whole array

        return arr;
    }

    static void printArray(int[] ansArr){
        int size = ansArr.length;
//        System.out.println("\nPrinting array:");
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

        System.out.println("Rotated Array:");
        printArray(rotateInPlace(arr, k));

    }
}
>>>>>>> 0bea72e (Prefix and Suffix Sum)
