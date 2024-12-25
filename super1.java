class A { /// every super class by default extends object class 
    public A(){
        System.out.println("in defalut of A");

    }
    public A(int a){
        System.out.println("in parameterized constructor A" +  a);
    }

    
}
class B extends A {
    public B(){

        // by default every class has super() method which calls the consrtuctor of super class 
        System.out.println("in defalut of B");
    }
    public B(int a){
        this();
        System.out.println("in parameterized constructor B" + a);
    }
    
}

public class super1 {
    public static void main(String[] args) {
        B obj = new B(2);
    }
    
}
