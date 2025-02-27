import java.util.Scanner;

public class ternary_oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary Operator
        String ans;
        ans = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(ans);
    }
}
