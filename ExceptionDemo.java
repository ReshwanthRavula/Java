
public class ExceptionDemo {

    public static void main(String[] args) {

        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String s = null;
        int d = (int)(Math.random()*10);
        System.out.println(d);
        try {
            j = 18 / i;
            System.out.println(s.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) { // catch block will be executed only if exceptions occurs
            System.out.println("you cannot divide number by zero" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(Exception e){
            System.out.println("something went wrong" + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }

}
