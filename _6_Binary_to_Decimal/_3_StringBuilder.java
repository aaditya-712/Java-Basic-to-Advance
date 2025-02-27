package _6_Binary_to_Decimal;

import java.util.Scanner;

public class _3_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();
        sc.close();  // Close the scanner

        if (decimalNum == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNum > 0) {
            binary.append(decimalNum % 2);
            decimalNum /= 2;
        }

        System.out.println(binary.reverse().toString());  // Reverse to get correct binary order
    }
}
