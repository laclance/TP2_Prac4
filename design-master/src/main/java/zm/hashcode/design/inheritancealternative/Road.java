package zm.hashcode.design.inheritancealternative;
import zm.hashcode.design.carinterface.*;

public class Road
{
    public Road(){
        CarInterfaceImpl car = new CarInterfaceImpl("Toyota");
        System.out.println (car.getMake());
    }
}
