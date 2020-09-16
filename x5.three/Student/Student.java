package x5all.x5.three.Student;

public class Student {
    public String firstName, lastName, group;
    public int sumGrants;
    double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, int sumGrants, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.sumGrants = sumGrants;
        this.averageMark = averageMark;
    }

    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            sumGrants = 100;
        } else {
            sumGrants = 80;
        }
        return sumGrants;
    }
}
