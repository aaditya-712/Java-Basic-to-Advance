package _8_Arrays;

class functionsInArray {
    static int[] arr = {1, 5, 3};
    void maxNumInArray() {
//        int[] arr = {1, 5, 3};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is: "+ max);
    }

    void searchElement(){
        //  LINEAR SEARCH

        int search = 3;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                ans = i;
            }
        }
        System.out.println("Found "+ search +" at index "+ ans);
    }
}

public class _4_maximumInArray {
    public static void main(String[] args) {
        functionsInArray obj = new functionsInArray();
        obj.maxNumInArray();
        obj.searchElement();
    }
}
