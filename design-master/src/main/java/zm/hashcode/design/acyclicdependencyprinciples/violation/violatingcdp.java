package zm.hashcode.design.acyclicdependencyprinciples.violation;

import zm.hashcode.design.carinterface.*;

public class violatingcdp {
    CarInterfaceImpl car = new CarInterfaceTruckImpl("Toyota");
}
