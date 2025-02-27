package _6_method_calling.skills;

public class App {
    public String str1 = "I am a public classs memeber";

    void printFromClass() {
        System.out.println("Within class: "+str1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println(obj.str1);

        App2 obj2 = new App2();
        obj2.printFromOutsideClass();
    }
}

class App2 {
    void printFromOutsideClass() {
        App obj = new App();
        System.out.println("Same Package, outside class: "+ obj.str1);
    }
}
