package introduction;

public class Main {
    public static void main(String[] args) {

        // store 5 roll numbers
        int[] numbers = new int[5];


        // store 5 names
        String[] names = new String[5];

        Student[] students = new Student[5];

        Student sai = new Student(7, "Sai Ganesh", (float) 70.7);

     //   sai.name = "Sai Ganesh";
       // sai.rno = 7;
       // sai.avgMarks = (float) 70.7;

        students[0] = sai;
        //

        System.out.println(sai.name);
        System.out.println(sai.rno);
        System.out.println(sai.avgMarks);
    }
}

class Student{
    int rno;
    String name;
    float avgMarks;

    public Student(int rollNumber, String name, float avgMarks){
        this.rno = rollNumber;
        this.name = name;
        this.avgMarks = avgMarks;
    }
}