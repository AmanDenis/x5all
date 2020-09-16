package x5all.x5.three.Phone;

public class Phone {


    private int number;
    private String model;
    private double weight;
    private String name;

    public Phone() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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