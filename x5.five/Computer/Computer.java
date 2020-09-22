package x5all.x5.five.Computer;

public class Computer {

    private CPU cpu;
    private RAM ram;
    private  GraphicsCard graphicsCard;
    private Storage storage;
    private Monitor monitor;

    public Computer() {
        this.cpu = new CPU(1.3,4,16024.0,"Intel","USA");
        this.ram = new RAM("China", 2048.0,1664.0, "SSD");
    }

    public void turnOn() {
        System.out.println("Включаем компьютер");
    }
}
