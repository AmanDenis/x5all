package x5.four.Car;

public class SportCar extends Car {
    int limitSpeed;

    public SportCar(String carModel, String carClass, double weigth, Engine motor, int limitSpeed) {
        super(carModel, carClass, weigth, motor);
        this.limitSpeed = limitSpeed;
    }


    @Override
    public void start() {

        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель: " + getCarModel());
        System.out.println("Класс Авто: " + getCarClass());
        System.out.println("Вес: " + getWeigth());
        System.out.println("Мощность: " + motor.power);
        System.out.println("Производитель: " + motor.manufacturer);
        System.out.println("Скорость: " + limitSpeed);
    }
}



