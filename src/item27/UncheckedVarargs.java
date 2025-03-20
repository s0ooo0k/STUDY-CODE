package item27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UncheckedVarargs {
    public static <T> void rentCars(List<T>... carList) {
        for(List<T> list : carList) {
            System.out.println("Rent: "+list);
        }
    }

    public static void main(String[] args) {
        List<Car> ElectricCars = Arrays.asList(new Car("Tesla"), new Car("Ionic"));
        rentCars(ElectricCars);
    }
}
