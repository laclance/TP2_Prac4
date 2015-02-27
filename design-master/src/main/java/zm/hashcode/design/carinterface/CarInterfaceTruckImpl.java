package zm.hashcode.design.carinterface;

public class CarInterfaceTruckImpl extends CarInterfaceBakkieImpl implements CarInterface {

    protected int length;

    public CarInterfaceTruckImpl(String make) {
        this.make = make;
    }

    public CarInterfaceTruckImpl(String make, int load, int length) {
        super(make, load);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
