package x5.four.Car;

public class Lorry extends Car{
    int carrying;

    public Lorry(String carModel, String carClass, double weigth, Engine motor, int carrying) {
        super(carModel, carClass, weigth, motor);
        this.carrying = carrying;
    }


    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель: " + getCarModel());
        System.out.println("Класс Авто: " + getCarClass());
        System.out.println("Вес: " + getWeigth());
        System.out.println("Мощность: " + motor.power);
        System.out.println("Производитель: " + motor.manufacturer);
        System.out.println("Грузоподъёмность: " + carrying);
    }
}
