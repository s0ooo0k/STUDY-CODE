package item19;

public class ElectricCar extends Car implements Electric {
    @Override
    public void charge() {
        System.out.println("Electric car charge");
    }
}
