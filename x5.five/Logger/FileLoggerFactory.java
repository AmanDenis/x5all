package x5all.x5.five.Logger;

public class FileLoggerFactory extends  LoggerFactory{

    @Override
    public Logger crLog() {
        return new FileLogger();
    }
}
