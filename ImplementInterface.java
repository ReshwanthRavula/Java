interface Computer {
    void code();

}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, complie, run: faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Computer com) {
        com.code();

    }
}

public class ImplementInterface {

    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer reshwanth = new Developer();
        reshwanth.devApp(desk);
    }
}
