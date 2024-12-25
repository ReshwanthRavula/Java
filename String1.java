public class String1 {
    public static void main(String[] args) {

        // String name = new String("reshwanth");
        // String name = "reshwanth";

        // name = name + " RAO";

        // System.out.println(name);
        // System.out.println(name.charAt(2));
        // System.out.println(name.concat(" Rao"));

        StringBuffer name = new StringBuffer("Reshwanth");

        // name.deleteCharAt(0);
        name.insert(9, "Java");

        name.append("Rao");

        // String str = name.toString();

        // // name.setLength(30);
        // name.setLength(100);

        

        System.out.println(name);

        // System.out.println(name.capacity());
    }
}

////////////////////////////////////////////////
/// mutable string -----> change ----- String
/// immutable string ------> unchange ------ String Buffer, String Builder 
