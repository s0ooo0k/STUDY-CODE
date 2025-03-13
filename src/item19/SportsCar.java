package item19;

public class SportsCar extends Car{
    @Override
    protected void accelrate() {
        System.out.println("sportscar accelrate");
        super.accelrate();
        super.accelrate();
    }
}