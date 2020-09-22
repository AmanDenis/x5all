package x5all.x5.five.Logger;

public class Main {

    public static void main(String[] args) {

        LoggerFactory clf = new ConsoleLoggerFactory();
        LoggerFactory flf = new FileLoggerFactory();
        LoggerFactory dlf = new DbLoggerFactory();

        Logger lo = clf.crLog();
        Logger l = flf.crLog();
        Logger log = dlf.crLog();

        Calculator clk = new Calculator(lo);
        Calculator cl = new Calculator(l);
        Calculator c = new Calculator(log);
        clk.plus(7,9);
        cl.minus(8,6);
        c.div(9.0,3.0);
        clk.mult(8,9);

    }
}

