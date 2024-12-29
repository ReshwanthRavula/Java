@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class LamdaExpression {
    public static void main(String[] args) {
        // A obj = i -> System.out.println("in show " + i);
        A obj = (i,j) -> i + j;
            
        
        int result = obj.add(3, 4);

        System.out.println(result);

    }

}
