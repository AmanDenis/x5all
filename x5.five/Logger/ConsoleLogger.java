package x5all.x5.five.Logger;

public class ConsoleLogger implements Logger{

    @Override
    public Calculator log(String message) {
        System.out.println("ConsoleLogger – Log into console: " + message);
        return null;
    }
}
