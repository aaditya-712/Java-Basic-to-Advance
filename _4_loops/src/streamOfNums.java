import java.util.Scanner;

public class streamOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to add: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
