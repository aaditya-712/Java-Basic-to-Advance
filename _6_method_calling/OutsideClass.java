package _6_method_calling;

import _6_method_calling.skills.*;

public class OutsideClass {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Outside Package, non-child class: "+obj.str1);

        App3 obj3 = new App3();
        obj3.printFromChildClass();
    }
}

class App3 extends App {
    void printFromChildClass() {
        App3 obj3 = new App3();
        System.out.println("Printed from child class: "+ obj3.str1);
    }
}