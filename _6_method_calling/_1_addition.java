package _6_method_calling;

import java.util.Scanner;

class Algebra1 {
    int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}

public class _1_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Algebra1 obj = new Algebra1();
        System.out.print("The sum is: ");
        int res = obj.add(x, y);
        System.out.print(res);
    }
}
