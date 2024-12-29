enum Status {
    Running, Failed, Pending, Success;

}

public class EnumDemo {
    public static void main(String[] args) {
        // int i = 5;
        // Status ss[] = Status.values();
        // // System.out.println(s.ordinal());

        // for(Status s : ss){
        // System.out.println(s + ":" + s.ordinal());
        // }
        Status s = Status.Pending;
        System.out.println(s.getClass().getSuperclass());

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Agian");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Success:
                System.out.println("Done");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }

}
