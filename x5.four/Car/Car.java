package x5.four.Car;

public abstract class Car {

    private String carModel;
    private String carClass;
    private double weigth;
    Engine motor;


    public Car(String carModel, String carClass, double weigth, Engine motor) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weigth = weigth;
        this.motor = motor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public abstract void start();

    public abstract void stop();

    public void turnRight() {

        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public abstract void printInfo();
}
