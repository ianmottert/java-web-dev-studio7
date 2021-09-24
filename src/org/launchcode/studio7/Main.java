package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        DVD myDvd = new DVD("ian", 400, 1600, 570);
        CD myCd = new CD("Hello", 200, 500, 200);
        myCd.spinDisc();
        myDvd.spinDisc();
    }
}
