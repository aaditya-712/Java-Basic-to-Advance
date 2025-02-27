// Buffer example

import java.util.Scanner;

public class input_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.next();                    // input: aadu deshmukh
        System.out.println("Entered name: "+ name); // output: aadu

        System.out.print("Enter a new string: ");
        String name2 = sc.nextLine();
        System.out.println("Entered String: "+ name2);

        // System.out.print("Enter a number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Entered Number: "+ num1);

        // sc.close();
    }
}


/* 
    The issue in your code is due to how Scanner handles input:

    Problem:
        sc.next() reads only the first word from input.

        When you enter "ad ad", it stores "ad" in name, and the remaining "ad" stays in the buffer.

        sc.nextLine() reads everything left in the buffer, which includes the leftover newline (\n).

        Since sc.next() didn't consume the newline character, sc.nextLine() reads an empty string instead of waiting for new input.

    Solution:
        After using sc.next(), add an extra sc.nextLine() to consume the newline before using sc.nextLine() again.

*/