package item19;

public class WrongCar {
    private int speed = 0;

    public WrongCar() {
        System.out.println("Car 생성자");
        // 부모 클래스 생성자에서 재정의 메서드를 호출할 경우 오류 발생
        accelrate();
    }

    public final void drive() {
        System.out.println("driving");
        accelrate();
        System.out.println("speed is " + speed);
    }

    protected void accelrate() {
        System.out.println("accelrate");
        speed += 10;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
