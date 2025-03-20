import java.util.List;
import java.util.Random;

/**
 * 여러 개의 항목 중 하나를 무작위로 선택하는 클래스입니다.
 * 3. 리스트 기반으로 수정
 */
class Chooser2<T> {
    private final List<T> choices;

    /**
     * Chooser 객체를 생성
     *
     * @param choices 선택할 요소들의 리스트
     * @throws IllegalArgumentException choices가 null이거나 비어 있으면 예외 발생
     */
    public Chooser2(List<T> choices) {
        if (choices == null || choices.isEmpty()) {
            throw new IllegalArgumentException("선택 목록은 비어 있을 수 없습니다.");
        }
        this.choices = choices;
    }

    /**
     * 리스트에서 무작위 요소를 선택하여 반환합니다.
     *
     * @return 무작위로 선택된 요소
     */
    public T pickRandom() {
        Random rand = new Random();
        return choices.get(rand.nextInt(choices.size()));
    }
}