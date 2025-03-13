package item3;

public class SingletonEnumMain {
    public static void main(String[] args) {
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        s1.singletonMethod();
    }
}
