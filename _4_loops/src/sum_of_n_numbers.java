import java.util.Scanner;

public class sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i = 1, sum=0;;
        while (i<=num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
