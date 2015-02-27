package zm.hashcode.design.softwaredesignprinciples.ocp.Correction;


import zm.hashcode.design.softwaredesignprinciples.ocp.Violation.Car;

public class SportsCar extends Car {

    public SportsCar(String make) {
        super(make);
    }

    public void print()
    {
        System.out.println ("I am a sport car");
    }
}
