package _8_Arrays;

import java.util.Scanner;

public class _14_SecondLargest {

    static int secondBiggest(int[] arr){
        int biggestNum = arr[0];
        int secondBiggest = arr[0];
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(arr[i] > biggestNum){
                biggestNum = arr[i];
            }
        }
        System.out.println("Biggest Number: "+biggestNum);
        for(int i=0; i<size; i++){
            if(arr[i] < biggestNum){
                if(arr[i] > secondBiggest){
                    secondBiggest = arr[i];
                }
            }
        }
        return secondBiggest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Biggest: "+secondBiggest(arr));
    }
}
