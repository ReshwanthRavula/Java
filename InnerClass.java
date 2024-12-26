abstract class A{
    // int age;

    public abstract void show();
    public abstract void config();

    // {
    //     System.out.println("in show A");
    
    // static class B{
    //      public void config(){
    //         System.out.println("in config");
    //      }
    // }

}

public class InnerClass {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // // A.B obj1 = obj.new B();
        // A.B obj1 = new A.B();
        // obj1.config(); 
        // A obj1 = new A(){ // anonymous 
        //     public void show(){
        //         System.out.println("in new class");
        //     }
        // };

        A obj1 = new A(){

            @Override
            public void show() {
                System.out.println("in show method");
            }

            @Override
            public void config() {
                System.out.println("in config method ");
            }
            
        };

        obj1.show();
        obj1.config();


    }
    
}
