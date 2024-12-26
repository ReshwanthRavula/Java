abstract class Car{

    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("music playing");
    }


}
abstract class WagnorR extends Car{
    public void drive(){

        System.out.println("car driving ....");
    }
    // public void fly(){
    //     System.out.println("flying.....");
    // }


}
class UpdatedWangnor extends WagnorR{ /// concrete class


    public void fly() {
        System.out.println("flying.....");
    }

}


public class Abstract {
    public static void main(String[] args) {
        Car A = new UpdatedWangnor(); // you cannot create the object of abstract class but you can create reference  
        A.playMusic();
        A.drive();
        A.fly();
    }
    
}
