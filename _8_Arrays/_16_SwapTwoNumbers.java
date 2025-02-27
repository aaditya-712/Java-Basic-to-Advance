package _8_Arrays;

public class _16_SwapTwoNumbers {

    static void swap(int a, int b){
        System.out.println("\nWith temp");
        System.out.println("Values before swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    static void swapWithoutTemp(int a, int b){
        System.out.println("\nWithout temp");
        System.out.println("Values before swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        swap(a, b);
        swapWithoutTemp(a, b);
    }
}
