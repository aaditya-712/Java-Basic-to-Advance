import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Odd/Even: ");
        int num = sc.nextInt();

        if(num%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}