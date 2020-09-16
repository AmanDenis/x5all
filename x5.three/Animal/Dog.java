package x5.three.Animal;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
     }

     @Override
    public void makeNoise() {
        System.out.println("Собака шумит");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }
}
