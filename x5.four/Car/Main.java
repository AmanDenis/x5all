package x5.four.Car;

public class Main {
    public static void main(String[] args) {
        Car c = new SportCar("bmw","c",1.8,new Engine(350, "GE"),150);
        c.start();
        c.turnRight();
        c.turnLeft();
        c.stop();
    }
}
