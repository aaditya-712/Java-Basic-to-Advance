package _8_Arrays;

import java.util.Scanner;

public class _15_FirstRepeatingValue {

    static int firstRepeatingValue(int[] arr){
        int repeatedValue = -1;
        int size = arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i] == arr[j]){
                   return arr[i];
                }
            }
        }
        return repeatedValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Repeated Value: "+firstRepeatingValue(arr));
    }
}
