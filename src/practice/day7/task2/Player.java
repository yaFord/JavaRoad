package practice.day7.task2;

import static practice.Utilities.RANDOM;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;


    public Player() {
        this.stamina = RANDOM.nextInt(11);
        if (countPlayers != 6) countPlayers++;
    }

    public void run() {
        if (this.stamina == 0) return;
        this.stamina--;
        if (this.stamina == 0) countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.printf("\nКоманды неполные. На поле есть %d свободных мест.\n", 6 - countPlayers);
        } else {
            System.out.println("\nНа поле нет свободных мест.");
        }
    }

    public int getStamina() {
        return stamina;
    }
}
