package item42;

public class Garage {
    void test() {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println(this); // 익명 클래스 자기 자신
            }
        };

        Runnable r2 = () -> {
            System.out.println(this); // Garage 클래스의 인스턴스
        };

        r1.run();
        r2.run();
    }

    @Override
    public String toString() {
        return "This is Garage";
    }
}

