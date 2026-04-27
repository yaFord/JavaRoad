package practice.day7.task2;

public class Runner {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
//        Player player7 = new Player();
//        Player player8 = new Player();

        while (player1.getStamina() != 0 /* Если подставить 1, то игрок останется на поле */) {
            System.out.print(player1.getStamina() + " > ");
            player1.run();
        }
        Player.info();
    }
}
