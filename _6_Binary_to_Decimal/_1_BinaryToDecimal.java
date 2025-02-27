package _6_Binary_to_Decimal;
import java.util.Scanner;

public class _1_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNum = sc.nextInt();

        int ans = 0; // converted decimal number
        int pw = 1; // 2 ^ 0 = 1 (power of 2)

        while(binaryNum > 0){
            int unitDigit = binaryNum % 10;
            ans += (unitDigit * pw);
            binaryNum /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
