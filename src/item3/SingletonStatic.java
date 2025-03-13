package item3;

// item3.SingletonStatic 클래스
public class SingletonStatic {
    private static final SingletonStatic INSTANCE = new SingletonStatic();

    private SingletonStatic() {
        System.out.println("싱글턴 생성!");
    }

    // 정적 팩토리 메서드
    public static SingletonStatic getInstance() {
        return INSTANCE;
    }
}
