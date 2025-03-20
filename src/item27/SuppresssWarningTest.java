package item27;

import java.util.ArrayList;
import java.util.List;

public class SuppresssWarningTest {
    @SuppressWarnings("unchecked")
    // carList 리스트에는 Car 객체만 추가 되어 타입이 모두 같다
    // 타입 안정성이 보장된다
    private static List<Car> cars = (List<Car>) new ArrayList();

    public static void main(String[] args) {
        cars.add(new Car("Tesla"));
        cars.add(new Car("Ionic"));

        for (Car car : cars) {
            System.out.println(car.model);
        }
    }
}

