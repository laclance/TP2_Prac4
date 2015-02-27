package zm.hashcode.design.objectorientedprinciples.encapsulation;

public class Car {
    private String make;

    public Car(String make){
        this.make = make;
    }

    public String getMake(){
        return this.make;
    }
}
