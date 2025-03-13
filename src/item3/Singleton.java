package item3;

public class Singleton {
    // 유일한 인스턴스
    public static final Singleton INSTANCE = new Singleton();
    private Singleton() {
        System.out.println("item3.Singleton 생성");
    }
}