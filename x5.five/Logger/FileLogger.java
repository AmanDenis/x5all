package x5all.x5.five.Logger;

public class FileLogger implements Logger{

    @Override
    public Calculator log(String message) {
        System.out.println("FileLogger – Log into console: " + message);
        return null;
    }
}
