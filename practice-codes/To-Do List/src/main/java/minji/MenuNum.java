package minji;

import java.util.Arrays;
import java.util.Optional;

public enum MenuNum {
    REGISTER_USER(1),
    SELECT_USER(2),
    ADD_TODO(3),
    VIEW_TODO(4),
    UPDATE_TODO(5),
    DELETE_TODO(6),
    EXIT(7);

    private final int value;

    MenuNum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static Optional<MenuNum> fromValue(int value) {
        return Arrays.stream(values())
                .filter(menu -> menu.getValue() == value)
                // Stream<MenuNum> -> Optional<MenuNum>
                .findFirst();
    }
}