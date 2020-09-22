package x5all.x5.five.Logger;

public class ConsoleLoggerFactory extends  LoggerFactory{

    @Override
    public Logger crLog() {
        return new ConsoleLogger();
    }
}
