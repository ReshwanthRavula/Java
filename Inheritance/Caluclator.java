package Inheritance;


public class Caluclator {
    public static void main(String[] args) {
        VeryAdvaceCal B = new VeryAdvaceCal();
    
        int a = B.addition(3, 5);
        int b = B.substraction(7, 3);
        int c = B.mul(3,4);
        int d = B.division(15,3); // method from different class AdvanceCalc
        double e = B.power(2, 3);

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        /// Reshwanth Ravula thinava  
    }
    
}
