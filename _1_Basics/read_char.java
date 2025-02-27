// in java like 'nextInt' there is no method for reading char like nextChar

import java.util.Scanner;

public class read_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Char at 1st place: "+ ch);
    }
}
