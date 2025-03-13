package item19;

public class Car {
    private int speed=0;

    /**
     * @implSpec
     * drive () method accelerates by calling {@link #accelrate ()}
     * The subclass can implement different acceleration methods by redefining Accelrate ().
     */
    public final void drive() {
        System.out.println("driving");
        accelrate();
        System.out.println("speed is " + speed);
    }
    /**
     * 가속 (protected로 구현된 hoock 메서드)
     * 하위 클래스에서 가속 방식 변경 가능
     */
    protected void accelrate() {
        speed+=30;
        System.out.println("accelrate");
    }

    public int getSpeed() {
        return speed;
    }
}