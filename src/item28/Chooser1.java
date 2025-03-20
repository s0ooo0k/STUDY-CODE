package item28;

import java.util.Random;

/**
 * 여러 개의 항목 중 하나를 무작위로 선택하는 클래스
 * 2. 제네릭을 사용한 시도 - 제네릭 배열 생성
 */
class Chooser1<T> {
    private final T[] choices; // 제네릭 배열 생성 불가
    /**
     * Chooser 객체를 생성
     *
     * @param choices 선택할 요소들의 배열
     */
    public Chooser1(T[] choices) {
        this.choices = choices; // 컴파일 오류 (타입 소거)
    }

    /**
     * 리스트에서 무작위 요소를 선택하여 반환
     *
     * @return 무작위로 선택된 요소
     */
    public T pickRandom() {
        Random rand = new Random();
        return choices[rand.nextInt(choices.length)];
    }
}