package item42;

public class Car {
    private final String name;
    private final int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "[Car] " + name + ", [speed]" + speed;
    }
}
