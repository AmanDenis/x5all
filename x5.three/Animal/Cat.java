package x5.three.Animal;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мурлычет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }
}
