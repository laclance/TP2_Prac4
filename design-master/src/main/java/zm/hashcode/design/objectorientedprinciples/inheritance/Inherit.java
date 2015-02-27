package zm.hashcode.design.objectorientedprinciples.inheritance;

import zm.hashcode.design.carinterface.*;

public class Inherit
{
    public Inherit() {
        CarInterface car = new CarInterfaceImpl();
        System.out.println(car.getMake());
    }
}
