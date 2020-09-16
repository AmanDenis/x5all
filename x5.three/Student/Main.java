package x5.three.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Aspirant();
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Aspirant();

        System.out.println(students[0].getScholarship(5));
        System.out.println(students[1].getScholarship(5));
    }
}
