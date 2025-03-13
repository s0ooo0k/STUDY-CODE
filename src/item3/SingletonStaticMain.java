package item3;

public class SingletonStaticMain {
    public static void main(String[] args) {
        SingletonStatic s1 = SingletonStatic.getInstance();
        SingletonStatic s2 = SingletonStatic.getInstance();
        SingletonStatic s3 = SingletonStatic.getInstance();
    }
}