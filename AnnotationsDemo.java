
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("is A show");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }

}

public class AnnotationsDemo {
    public static void main(String[] args) {

        B obj = new B();

        obj.showTheDataWhichBelongsToThisClass();
    }

}