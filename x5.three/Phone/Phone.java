package x5.three.Phone;

public class Phone {


    int number;
    String model;
    double weight;
    private String name;

    Phone() {

    }

    public String receiveCall(String name) {
        return name;
    }

    public int getNumber(int number) {
        return number;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;


    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public String receiveCall(String name, int number) {

        return name + number;
    }

    public void sendMessage(int... numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }
}