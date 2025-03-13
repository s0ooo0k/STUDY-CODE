package item19;

public class TeslaCar extends Car implements Electric, SelfDrive{
    @Override
    public void charge() {
        System.out.println("Tesla car charge");
    }

    @Override
    public void autoPilot() {
        System.out.println("Tesla car autoPilot");
    }
}
