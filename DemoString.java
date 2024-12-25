
class Mobile {

    String brand;
    int price;
    static String name;

    public void print(){
        System.out.println(brand + " : " + price + " " + name);
    }

    public static void print1(Mobile obj){

        // System.out.println("in static method");
        System.out.println(obj.brand + " : " + obj.price + " " + name);
    }

}

 



public class DemoString {

    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();

        obj1.brand = "Samsung";
        obj1.price = 1800;
        Mobile.name = "Smartphone";

        obj2.brand = "Apple";
        obj2.price = 1500;
        Mobile.name = "Smartphone";

        obj1.name = "phone";

        obj1.print();
        obj2.print();

        Mobile.print1(obj1);




        

    }
    
}
