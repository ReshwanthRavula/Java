// class - class --> extends 
// class - interface ---> implements
// interface - interface ---> extends 

interface A {
    int age = 44;
    String area = "mumbai";

    public void show();

    public void config();

}

interface X extends A {
    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println("in show");

    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }

}

public class Interface {
    public static void main(String[] args) {
        // B obj = new B();
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1;
        obj1 = new B();
        obj1.run();

        Y obj2;
        obj2 = new B();
        obj2.show();
        obj2.run();

        System.out.println(A.area + A.age);
    }

}
