package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {

    private String name;
    private double capacity;
    private double maxDiscSpeed;
    private double minDiscSpeed;

    public BaseDisc(String name, double capacity, double maxDiscSpeed, double minDiscSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.maxDiscSpeed = maxDiscSpeed;
        this.minDiscSpeed = minDiscSpeed;
    }

    public double getMaxDiscSpeed() {
        return maxDiscSpeed;
    }

    public void setMaxDiscSpeed(double maxDiscSpeed) {
        this.maxDiscSpeed = maxDiscSpeed;
    }

    public double getMinDiscSpeed() {
        return minDiscSpeed;
    }

    public void setMinDiscSpeed(double minDiscSpeed) {
        this.minDiscSpeed = minDiscSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
