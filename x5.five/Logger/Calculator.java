package x5all.x5.five.Logger;

public class Calculator {

    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }

    public Integer plus(Integer a, Integer b) {
        Integer result = a + b;
        if (logger != null) {
            logger.log(a + " + " + b + " = " + result);
        }
        return result;
    }

    public Integer minus(Integer a, Integer b) {
        Integer result = a - b;
        if (logger != null) {
            logger.log(a + " - " + b + " = " + result);
        }
        return result;
    }

    public Double div(Double a, Double b) {
        Double result = a / b;
        if (logger != null) {
            logger.log(a + " / " + b + " = " + result);
        }
        return result;
    }

    public Integer mult(Integer a, Integer b) {
        Integer result = a * b;
        if (logger != null) {
            logger.log(a + " * " + b + " = " + result);
        }
        return result;
    }
}

