<<<<<<< HEAD
package _8_Arrays;

import java.util.Scanner;

public class _13_UniqueNumber {

    static int uniqueNumber(int[] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<size; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Found unique element: "+ uniqueNumber(arr));
    }
}
=======
package _8_Arrays;

import java.util.Scanner;

public class _13_UniqueNumber {

    static int uniqueNumber(int[] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for(int i=0; i<size; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Found unique element: "+ uniqueNumber(arr));
    }
}
>>>>>>> 0bea72e (Prefix and Suffix Sum)
