package UC_6;

public class SnakeAndLadder {
    public void numOfDiceThrow() {
        int winningPosition = 100;
        int playerPosition = 0;
        int moves=0;

        while (playerPosition != winningPosition) {
            moves++;

            int rollTheDie = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("Roll the Dice : " + rollTheDie);

            int optionCheck = (int) (Math.floor(Math.random() * 10) % 3);

            if (optionCheck == 0) {
                System.out.println("No play : " + playerPosition);
            } else if (optionCheck == 1) {
                if (playerPosition + rollTheDie > winningPosition) {
                    playerPosition -= rollTheDie;
                    System.out.println("Ladder : " + playerPosition);
                } else {
                    playerPosition += rollTheDie;
                    System.out.println("Ladder : " + playerPosition);
                }
            } else {
                playerPosition -= rollTheDie;
                if (playerPosition < 0)
                    playerPosition = 0;
                System.out.println("Snake : " + playerPosition);
            }
        }
        System.out.println("Number Of Total moves : " +moves);
    }
}
