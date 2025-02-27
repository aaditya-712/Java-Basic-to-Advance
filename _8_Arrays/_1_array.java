package _8_Arrays;

class arrayExample {

    void multiArray() {
//        int[][] arr1 = new int[2][3];
        int[][] arr = {{12, 23}, {34, 45}, {56,67}};

        System.out.println("Length of arr: "+ arr.length);

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
    }

    void demoArrays(){
        int[] ages = new int[2];
        float[] weight = new float[2];
        String[] name = {"Ram", "Raj"};

        ages[0] = 21;
        ages[1] = 22;

        weight[0] = 29.2f;
        weight[1] = 56.3f;


        System.out.println(ages[0]);
        System.out.println(ages[1]);

        System.out.println(weight[0]);
        System.out.println(weight[1]);

        System.out.println(name[0]);
        System.out.println(name[1]);

    }
}

public class _1_array {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
//        obj.demoArrays();
        obj.multiArray();
    }
}
