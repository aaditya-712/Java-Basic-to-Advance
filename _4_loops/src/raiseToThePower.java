// Given 2 numbers a and b. Find a raise to the power b.

import java.util.Scanner;

public class raiseToThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Power: ");
        int b = sc.nextInt();
        int res = 1;

        for (int i = 0; i<b; i++) {
            res *= a;
        }
        System.out.println(res);
    }
}
