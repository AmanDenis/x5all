package x5all.x5.five.Computer;

public class CPU {

    private double clockFrequency;
    private int numberOfCores;
    private double cacheMemory;
    private String name;
    private String manufacturer;

    public CPU(double clockFrequency, int numberOfCores, double cacheMemory, String name, String manufacturer) {
        this.clockFrequency = clockFrequency;
        this.numberOfCores = numberOfCores;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufacturer = manufacturer;
    }


}
