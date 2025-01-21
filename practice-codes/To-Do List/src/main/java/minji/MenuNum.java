package minji;

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
        for (MenuNum menu : values()) {
            if (menu.getValue() == value) {
                return menu;
            }
        }
        return null;
    }
}
