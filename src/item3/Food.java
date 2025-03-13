package item3;

public class Food{
    private String pasta;

    // 생성자
    private Food(String pasta){
        this.pasta = pasta;
    }

    // 정적 팩토리 메서드
    public static Food eat(String pasta){
        return new Food(pasta);
    }

    public String getPasta(){
        return pasta;
    }
}

