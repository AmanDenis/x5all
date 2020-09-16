package x5.three.Animal;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь иГоГО");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }
}