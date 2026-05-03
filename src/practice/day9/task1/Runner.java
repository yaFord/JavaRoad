package practice.day9.task1;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student("Ильдар", "ИСВ-11");
        Teacher teacher = new Teacher("Баязитова", "Математика");

        System.out.printf("Предмет: %s. Группа: %s.\n", teacher.getSubject(), student.getGroup());
        student.printInfo();
        teacher.printInfo();
    }
}
