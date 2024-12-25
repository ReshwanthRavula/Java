class Calculator{

    int a = 10; // instance variable which are part of heap memory 

    public int add(int a, int b, int c) // local variable which are the part of stack memory 
    {
        return a + b + c;
    }

    public int add(int a, int b)
    {
        // int result = a + b;
        // System.out.println("addition of two numbers is:");
        return a*2 + b*3; ////dbwbjcjebeb
    }
}

public class DemoObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // calc.add();
        int num1 = 10;
        int num2 = 20;

        int result = calc.add(num1,num2);
        int result1 = calc.add(2, 4, 5);

        // int result = calc.add();
        System.out.println(result);
        System.out.println(result1);
    }
    
}
