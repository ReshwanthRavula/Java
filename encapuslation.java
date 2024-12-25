
class Human{
    private int age;
    private String name;

    public Human(){
        // System.out.println("in constructor");
        age = 12;
        name = "john";
        
    }

    public Human(int a, String n){
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; /// this refers to current object which is calling the function 
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}



public class encapuslation {
    
    public static void main(String[] args) {

        Human h1 = new Human();
        Human h2 = new Human(23,"Risheek");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());

        System.out.println(h2.getAge());
        System.out.println(h2.getName());

        // h1.age = 20;
        // h1.name = "reshwanth";
        
        h1.setAge(20);
        h1.setName("reshwanth");

        System.out.println(h1.getAge());
        System.out.println(h1.getName());
    }
}
