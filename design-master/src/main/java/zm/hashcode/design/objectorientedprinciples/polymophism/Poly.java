package zm.hashcode.design.objectorientedprinciples.polymophism;

import zm.hashcode.design.carinterface.*;

public class Poly
{
    public Poly() {
        CarInterfaceImpl bakkie = new CarInterfaceBakkieImpl();
        System.out.println(bakkie.getMake());
    }
}
