package _8_Arrays;

import java.util.Scanner;

public class _11_PairSum {

    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int count = 0;

        for(int i=0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the targetted sum: ");
        int target = sc.nextInt();


        System.out.println("The total number of pairs having sum "+target+" : "+pairSum(arr, target));
    }
}
