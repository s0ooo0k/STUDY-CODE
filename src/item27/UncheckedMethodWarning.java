package item27;

import java.util.ArrayList;
import java.util.List;

public class UncheckedMethodWarning {
    public static void main(String[] args) {
        List cars = new ArrayList();
        addCar(cars, new Car("Tesla"));
    } // cars는 로 타입
    public static void addCar(List<Car> carList, Car car) {
        carList.add(car);
    } // 제네릭 타입 메서드
} // 제네릭 타입이 있는 메서드에서 로 타입 사용시
// 확인되지 않은 대입: 'java.util.List'을(를) 'java.util.List<item27.Car>'에

