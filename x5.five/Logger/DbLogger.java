package x5all.x5.five.Logger;

public class DbLogger implements Logger{

    @Override
    public Calculator log(String message) {
        System.out.println("DbLogger – Log into console: " + message);
        return null;
    }
}
