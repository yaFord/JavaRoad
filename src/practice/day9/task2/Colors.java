package practice.day9.task2;

public enum Colors {
    BLUE("Синий"), RED("Красный"), GREEN("Зеленый"), ORANGE("Оранжевый");
    private final String text;

    Colors(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
