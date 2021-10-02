package task2.racingcar;

import task2.utils.RandomUtils;

public class Car {
    private final int MIN_RANDOM_VALUE = 0;
    private final int MAX_RANDOM_VALUE = 9;
    private final int FORWARD_CRITERIA = 4;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void race() {
        int randomValue = RandomUtils.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
        if (randomValue >= FORWARD_CRITERIA) {
            position += randomValue;
        }
    }
    // 추가 기능 구현
}
