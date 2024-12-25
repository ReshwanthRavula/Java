class Student{

    String name;
    int Rollno;
    int marks; 

    
}


public class ArrayOfStrings {

    public static void main(String1[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.Rollno = 1;
        s1.marks = 88;
        s1.name = "Reshwanth";

        s2.Rollno = 2;
        s2.marks = 78;
        s2.name = "Sreeja";

        s3.Rollno = 3;
        s3.marks = 88;
        s3.name = "Anish";

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i].name);
            
        }

        for(Student n : students){
            System.out.println(n.name + " " + n.Rollno + " " + n.marks);
        }


        int si1[]= new int[3];

        si1[0] = 1;
        si1[1] = 2;
        si1[2] = 3;

        for(int n : si1)
        {
            System.out.println(n);
        }





    
        
    }
    
}
