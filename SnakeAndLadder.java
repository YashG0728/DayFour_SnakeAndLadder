package UC_4;

public class SnakeAndLadder {
    public void reachesPosition() {
        int winningPosition = 100;
        int playerPosition = 0;

        while (playerPosition < winningPosition) {

            int rollTheDie = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("Roll the Dice : " + rollTheDie);

            int optionCheck = (int) (Math.floor(Math.random() * 10) % 3);

            if (optionCheck == 0) {
                System.out.println("No play : " + playerPosition);
            } else if (optionCheck == 1) {
                playerPosition += rollTheDie;
                System.out.println("Ladder : " + playerPosition);
            } else {
                playerPosition -= rollTheDie;
                System.out.println("Snake : " + playerPosition);
            }
        }
    }
}