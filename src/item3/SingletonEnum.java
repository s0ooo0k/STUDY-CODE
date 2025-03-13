package item3;

public enum SingletonEnum {
    // 유일한 인스턴스
    INSTANCE; 
    
    // 생성자(클래스 로딩 시점 자동 실행)
    SingletonEnum(){
        System.out.println("싱글턴 실행");
    }
    
    public void singletonMethod(){
        System.out.println("메소드 실행");
    }
}
