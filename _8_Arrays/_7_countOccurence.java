package _8_Arrays;

public class _7_countOccurence {

    static void countOccurrence(int[] arr, int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(target +" found "+count+" times");
    }

    static int lastOccurrence(int[] arr, int target){
        int lastOcc = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                lastOcc = i;
            }
        }
        return lastOcc;
    }

    static int strictlyGreater(int[] arr, int num){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > num){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 1;
        arr[4] = 5;

        // Count Total Occurrence
        int x = 5;
        countOccurrence(arr, x);

        // Last Occurrence
        int res = lastOccurrence(arr, x);
        System.out.println("Last Occurence: "+res);

        // Strictly Greater than
        int num = 2;
        res = strictlyGreater(arr, num);
        System.out.println("Count of numbers strictly greater than "+num+" is "+res);
    }
}
