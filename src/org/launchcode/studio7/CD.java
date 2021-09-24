package org.launchcode.studio7;

public class CD extends BaseDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD(String name, double capacity, double maxDiscSpeed, double minDiscSpeed) {
        super(name, capacity, maxDiscSpeed, minDiscSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + getMinDiscSpeed() +" - " + getMaxDiscSpeed() + " rpm.");
    }

    @Override
    public void readDisk() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void loadInfo() {

    }
}
