package zm.hashcode.design.carinterface;

public class CarInterfaceBakkieImpl extends CarInterfaceImpl
{
    protected int load;

    public CarInterfaceBakkieImpl(){make = ""; load = 0;}

    public CarInterfaceBakkieImpl(String make, int load)
    {
        this.make = make;
        this.load = load;
    }

    public int getLoad() {return load;}

    public void setLoad(int load) {this.load = load;}
}
