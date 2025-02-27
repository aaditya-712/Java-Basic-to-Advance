package _8_Arrays;

import java.util.Scanner;

public class _12_TripletSum {

    static int tripletSum(int[] arr, int target){
        int size = arr.length;
        int count = 0;

        for(int i=0; i<size; i++){ // initializing for first number
            for(int j=i+1; j<size; j++){ // initializing for second number
                for(int k=j+1; k<size; k++){ // initializing for third number
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println("a: "+arr[i]+", b: "+arr[j]+", c: "+arr[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // INITIALISING ARRAY
        int[] arr = new int[size];

        // TAKING INPUT FOR ARRAY
        for(int i=0; i<size; i++){
            System.out.print("Enter element "+ (i+1) +": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the targetted sum: ");
        int target = sc.nextInt();

        // CALL THE FUCTION
        System.out.println("The pair/pairs of triple is/are: "+ tripletSum(arr, target));
    }
}
