package x5all.x5.three.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Aspirant("A", "B","2", 150,4,"w");
        Student[] students = new Student[2];
        students[0] = new Student("D", "A", "1",100, 5);
        students[1] = new Aspirant("Q","Q","3",200,6,"qw");

        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
    }
}
