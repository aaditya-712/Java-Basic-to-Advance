import java.util.Scanner;

public class reverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int orignal_num = num, res=0;

        while (num>0) {
            res = res * 10 + (num%10);
            num /= 10;
        }
        System.out.println("The reverse of "+orignal_num+" is "+res);
    }
}
