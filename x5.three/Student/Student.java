package x5all.x5.three.Student;

public class Student {
    protected static int sumGrants;
    private String firstName, lastName, group;
    protected double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public int getSumGrants() {
        return sumGrants;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstName, String lastName, String group, int sumGrants, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.sumGrants = sumGrants;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5) {
            sumGrants = 100;
        } else {
            sumGrants = 80;
        }
        return sumGrants;
    }
}
