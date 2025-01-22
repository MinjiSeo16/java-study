package minji;

import java.util.Arrays;

public enum MenuNum {
    ADD_TODO(1),
    VIEW_TODO(2),
    UPDATE_TODO(3),
    DELETE_TODO(4),
    EXIT(5);

    private final int value;

    MenuNum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public static MenuNum fromValue(int value) {
        return Arrays.stream(values())
                .filter(menu -> menu.getValue() == value)
                // Stream<MenuNum> -> Optional<MenuNum>
                .findFirst()
                .orElse(null);
    }
}