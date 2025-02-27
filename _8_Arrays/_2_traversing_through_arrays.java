package _8_Arrays;

class exampleArray {

    void multiArray() {
        int[][] arr1 = {{12, 23, 34}, {45, 56, 67}};

        System.out.println("for loop:");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    void demoArray() {
        int[] ages = {18, 21, 15, 23};

        // for loop
        System.out.println("for loop:");
        for(int i = 0; i < 4; i++){
            System.out.println(ages[i]);
        }

        // for each loop
        System.out.println("for each loop:");
        for(int age : ages){
            System.out.println(age);
        }

    }
}

public class _2_traversing_through_arrays {
    public static void main(String[] args) {
        exampleArray obj = new exampleArray();
//        obj.demoArray();
        obj.multiArray();
    }
}
