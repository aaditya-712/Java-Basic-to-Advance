import java.util.Scanner;

public class sumOdDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); //7894561230
        int orignal_num = num;
        int sum = 0;

        while (num>0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The sum of "+orignal_num+ " is "+sum);
    }
}
