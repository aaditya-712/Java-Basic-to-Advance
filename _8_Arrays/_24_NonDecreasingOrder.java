package _8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class _24_NonDecreasingOrder {

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int[] arr){
        int n = arr.length;
        int temp, left = 0, right = n -1;
        while (left < right){
            temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    static int[] squareArray(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1, index = 0;
        int[] ans = new int[n];

        while(left <= right){
            if(abs(arr[left]) > abs(arr[right])){
                ans[index++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[index++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nSquare Array:");
//        printArray(arr);
        int[] ans = squareArray(arr);
        printArray(ans);

        System.out.println("\nNon-Decreasing Array:");
        reverseArray(ans);
        printArray(ans);
    }
}
