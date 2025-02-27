import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.print("Enter time(years): ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;
        float total = p + si;

        System.out.println("Principle Amount: "+ p);
        System.out.println("Rate of Interest: "+ r);
        System.out.println("Time Period: "+ t);
        System.out.println("Simple Interest: "+ si);
        System.out.println("Total amount: "+ total);
    }
}
