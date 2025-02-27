package _8_Arrays;

public class _6_changeArray {

    static void changeArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void changeVal(int a){
        a = 123;
        System.out.println("Inside medthod: "+a);
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 8;
        arr[2] = 9;

        int a = 1;
        System.out.println("OG val: "+a);
        changeVal(a);
        System.out.println("Changed val: "+a);

        System.out.print("Original Array: ");
        printArray(arr);

        //changing array
        changeArray(arr);
        System.out.print("Changed Array: ");
        printArray(arr);
    }
}
