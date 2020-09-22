package x5all.x5.five.Logger;

public class DbLoggerFactory extends  LoggerFactory{

    @Override
    public Logger crLog() {
        return new DbLogger();
    }
}
