package _6_Binary_to_Decimal;
import java.util.Scanner;

public class _2_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();

        int ans = 0; // binary number
        int pw = 1; // power of 10

        while(decimalNum > 0){
            int parity = decimalNum % 2;
            ans += (parity * pw);
            pw *= 10;
            decimalNum /= 2;
        }
        System.out.println(ans);
    }
}
