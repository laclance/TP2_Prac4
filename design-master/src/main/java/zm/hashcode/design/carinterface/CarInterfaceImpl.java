package zm.hashcode.design.carinterface;

public class CarInterfaceImpl implements CarInterface
{
    protected String make;

    public CarInterfaceImpl(){ make = "";}

    public CarInterfaceImpl(String make) {this.make = make;}

    public void setMake(String make) {this.make = make;}

    public String getMake() {return make;}
}
