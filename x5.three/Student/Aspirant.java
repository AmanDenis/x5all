package x5all.x5.three.Student;

public class Aspirant extends Student {
    public String scientWork;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, int sumGrants, double averageMark,
                    String scientWork) {
        super(firstName, lastName, group, sumGrants, averageMark);
        this.scientWork = scientWork;
    }

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


