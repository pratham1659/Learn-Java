package Java09Oops.Java07Encapsulation.publicClass;

import Java09Oops.Java07Encapsulation.getterSetter.Car;

public class getterSetterTest {

    public static void main(String[] args) {
        Car swift = new Car("Red", "Maruti", 3, 845000);

        swift.setColour("Yellow");
        swift.setCostOfPurchase(900000);
        System.out.printf("%s %s %s %s", swift.getColor(), swift.getModel(), swift.getFuelLevel(),
                swift.getCostOfPurchase());

    }
}
