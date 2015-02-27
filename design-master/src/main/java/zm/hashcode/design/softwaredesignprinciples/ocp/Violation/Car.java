package zm.hashcode.design.softwaredesignprinciples.ocp.Violation;

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
        if (make.equals("Ferrari") || make.equals("Masirati"))
            System.out.println ("I am a sport car");
        else
            System.out.println ("I am a normal road car");
    }
}
