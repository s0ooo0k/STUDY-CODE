package item20;

// Skeletal Implementation
// Car 인터페이스를 보완하는 추상 클래스
public class AbstractCar implements Car {
    // 공통 기능에 대한 기본 구현 제공
    @Override
    public void move() {
        System.out.println("AbstractCar move");
    }

    @Override
    public void alarm() {
        System.out.println("AbstractCar alarm");
    }
}
