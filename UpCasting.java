class A{
    public void show1(){
        System.out.println("in A show");
    }

}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }

}

public class UpCasting {
    public static void main(String[] args) {
        A obj = new B(); // up casting 
        obj.show1();

        B obj1 = (B)obj;
        obj1.show2(); /// down casting 
    

    }
    
}
