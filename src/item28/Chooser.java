package item28;

import java.util.Random;

/**
 * 여러 개의 항목 중 하나를 무작위로 선택하는 클래스
 * 1. 제네릭 적용하지 않은 초기 버전 - Object[]
 */
class Chooser {
    private final Objcet[] choices;
    /**
     * Chooser 객체를 생성
     *
     * @param choices 선택할 항목 배열 (Object 타입)
     */
    public Chooser(Object[] choices) {
        this.choices = choices;
    }
    /**
     * 리스트에서 무작위 요소를 선택하여 반환
     *
     * @return 무작위로 선택된 요소 (Object 타입)
     */
    public Object pickRandom() {
        Random rand = new Random();
        return choices[rand.nextInt(choices.length)];
    }
}