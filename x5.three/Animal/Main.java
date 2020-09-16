package x5all.x5.three.Animal;

public class Main {
    public static void main(String[] args) {

//        Dog dog = new Dog("кость ", "будка");
//        Cat cat = new Cat("рыба ", "дом");
//        Horse horse = new Horse("трава ", "конюшня");
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animal = new Animal[3];
        animal[0] = new Dog("кость ", "будка");
        animal[1] = new Cat("рыба ", "дом");
        animal[2] = new Horse("трава ", "конюшня");
        for (int i = 0; i < animal.length; i++) {
                veterinarian.treatAnimal(animal[i]);
        }
    }
}
