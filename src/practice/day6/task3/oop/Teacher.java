package practice.day6.task3.oop;

import practice.day6.task3.Modes;

import static practice.Utilities.RANDOM;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student, Modes mode) {
        int intGrade = RANDOM.nextInt(2, 6);
        System.out.printf("[%s - %s] Оценка: %s.\n",
                this.name, student.getName(), mode.value ? intGrade : getStringGrade(intGrade));
    }

    private String getStringGrade(int intGrade) {
        return switch (intGrade) {
            case 2 -> "Неудовлетворительно";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> "Неизвестно";
        };
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
