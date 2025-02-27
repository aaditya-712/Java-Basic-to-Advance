package _8_Arrays;

class sumOfArray {

    void arraySum() {
        int[] arr = {1, 5, 3};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum is: "+ sum);

    }
}

public class _3_sumOfArray {
    public static void main(String[] args) {
        sumOfArray obj = new sumOfArray();
        obj.arraySum();
    }
}
