package item19;

public class BrokenCar extends WrongCar{
    // 이 위치에서는 초기화 X
    private Integer turboSpeed;

    public BrokenCar() {
        System.out.println("BrokenCar 생성자");
        // 초기화
        this.turboSpeed = 50;
    }

    @Override
    protected void accelrate() {
        System.out.println("BrokenCar accelrate");

        // turboSpeed가 초기화 이전이라 오류 발생
        setSpeed(getSpeed() + turboSpeed);
    }
}
