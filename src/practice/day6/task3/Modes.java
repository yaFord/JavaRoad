package practice.day6.task3;

public enum Modes {
    STRING(false), INT(true);

    public final boolean value;
    Modes(boolean value) {
        this.value = value;
    }
}
