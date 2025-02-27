//** ues '.clone()' to perfectly copy array in new memory locations

package _8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _5_arrayInput {

     static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Taling input for array
        for(int i=0; i<size; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        // printing arr
        System.out.print("Original Array: ");
        printArray(arr);

        // copying arr in arr2 //** ues '.clone()' to perfectly copy array in new memory locations
        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        int[] arr2 = arr.clone();
        System.out.print("Copied Array: ");
        printArray(arr2);

        // changing values of arr2
        arr2[0] = 0;
        arr2[1] = 0;

        System.out.print("Original Array after changing arr2: ");
        printArray(arr);

        System.out.print("Copied Array after changing arr2: ");
        printArray(arr2);
    }
}
