package _7_OOP;

class Student{
    int roll_no;
    String name;
}
public class _3_Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.roll_no = 1;
        obj1.name = "Aaditya";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.name);

        Student obj2 = new Student();
        obj2.roll_no = 2;
        obj2.name = "Nikhil";
        System.out.println(obj2.roll_no);
        System.out.println(obj2.name);
    }
}
