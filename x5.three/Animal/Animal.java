package x5all.x5.three.Animal;

public class Animal {
     private String food;
     private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Шумит");
    }

    public void eat() {
        System.out.println("Трапеза");
    }

    public void sleep() {
        System.out.println("Спит");
    }

}
