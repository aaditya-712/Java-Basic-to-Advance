package _8_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _10_smallestAndBiggest {

    static int[] smallestAndBiggest(int[] arr){
        Arrays.sort(arr);

        System.out.println("printing sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] ans = {arr[0], arr[arr.length-1]};
        System.out.println("answer array: ");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int[] res = smallestAndBiggest(arr);
        System.out.println("Smallest: "+res[0]);
        System.out.println("Largest: "+res[1]);

    }
}
