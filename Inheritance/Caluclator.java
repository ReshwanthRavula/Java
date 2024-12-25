package Inheritance;


public class Caluclator {
    public static void main(String[] args) {
        AdvanceCalc B = new AdvanceCalc();
    
        int a = B.addition(3, 5);
        int b = B.substraction(7, 3);
        int c = B.mul(3,4);
        int d = B.division(15,3); // method from different class AdvanceCalc

        System.out.printf("Add: %d, Sub: %d, Mul: %d, Div: %d%n", a, b, c, d);

    }
    
}
