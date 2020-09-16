package x5.three.Student;

public class Student {
    String firstName, lastName, group;
    int sumGrants;

    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            sumGrants = 100;
        } else {
            sumGrants = 80;
        }
        return sumGrants;
    }
}
