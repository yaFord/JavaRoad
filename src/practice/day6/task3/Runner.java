package practice.day6.task3;

import practice.day6.task3.oop.Student;
import practice.day6.task3.oop.Teacher;

public class Runner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Имя преподавателя", "Какой-то предмет");
        Student[] students = {new Student("Студент-1"), new Student("Студент-2")};

        for (Student student : students) {
            teacher.evaluate(student, Modes.INT);
        }
    }
}
