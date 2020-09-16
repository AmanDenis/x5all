package x5.three.Student;

public class Aspirant extends Student {
    String scWork;

    @Override
    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            sumGrants = 200;
        } else {
            sumGrants = 180;
        }
        return sumGrants;
    }
}


