import java.util.Scanner;

public class even_and_divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0) {
            System.out.println("Even and Divisible by 3");
        } else if (num%2==0) {
            System.out.println("Even");
        } else if (num%2==1 && num%3==0) {
            System.out.println("Odd and Divisible by 3");
        } else {
            System.out.println("Odd");
        }
    }
}
