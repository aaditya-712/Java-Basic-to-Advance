package _6_method_calling;

import java.util.Scanner;

class Algebra{
    int a;
    int b;

    Algebra(int x, int y){
        System.out.println("Constructor of Algebra class is called");
        a = x;
        b = y;
    }

    int add(){
        return a + b;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }
}

public class _4_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra obj = new Algebra(5 , 7);

        System.out.println("Sum is: ");
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(10,12);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

    }
}
