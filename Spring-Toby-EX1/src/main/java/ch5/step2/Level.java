package ch5.step2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Dongmyeong Lee
 * @since 2020/03/11
 */
public enum Level {
    GOLD(3, null),  SILVER(2, GOLD), BASIC(1, SILVER);

    private final int value;
    private final Level next;

    Level(int value, Level next) {
        this.value = value;
        this.next = next;
    }

    public int intValue(){
        return value;
    }

    public Level nextLevel(){
        return this.next;
    }

    // 값으로 부터 레벨 타입 오브젝트를 가져온다.
    public static Level valueOf(int value){
        switch (value) {
            case 1: return BASIC;
            case 2: return SILVER;
            case 3: return GOLD;
            default: throw new AssertionError("Unknown value: " + value);
        }
    }
}
