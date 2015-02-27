package zm.hashcode.design.softwaredesignprinciples.ocp.Correction;

public class Car {
    private String make;

    public Car(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void print()
    {
        System.out.println ("I am a normal road car");
    }
}
