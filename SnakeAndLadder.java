package UC_7;

public class SnakeAndLadder {
    public void WhoWillWin() {
        int winningPosition = 100;
        int playerPositionOne = 0;
        int playerPositionTwo = 0;
        int moves = 0;

        while ((playerPositionOne != winningPosition) && (playerPositionTwo != winningPosition)) {
            moves++;
            //For PlayerOne
            int rollTheDie = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("Roll the Dice : " + rollTheDie);

            int optionCheckOne = (int) (Math.floor(Math.random() * 10) % 3);

            if (optionCheckOne == 0) {
                System.out.println("No play : " + playerPositionOne);
            } else if (optionCheckOne == 1) {
                if (playerPositionOne + rollTheDie > winningPosition) {
                    playerPositionOne -= rollTheDie;
                    System.out.println("Ladder : " + playerPositionOne);
                } else {
                    playerPositionOne += rollTheDie;
                    System.out.println("Ladder : " + playerPositionOne);
                }
            } else {
                playerPositionOne -= rollTheDie;
                if (playerPositionOne < 0)
                    playerPositionOne = 0;
                System.out.println("Snake : " + playerPositionOne);
            }

            //ForPlayerTwo
            int rollTheDie2 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
            System.out.println("Roll the Dice : " + rollTheDie2);

            int optionCheck2 = (int) (Math.floor(Math.random() * 10) % 3);
            if (optionCheck2 == 0) {
                System.out.println("No play : " + playerPositionTwo);
            } else if (optionCheck2 == 1) {
                if (playerPositionTwo + rollTheDie2 > winningPosition) {
                    playerPositionTwo -= rollTheDie2;
                    System.out.println("Ladder : " + playerPositionTwo);
                } else {
                    playerPositionTwo += rollTheDie2;
                    System.out.println("Ladder : " + playerPositionTwo);
                }
            } else {
                playerPositionTwo -= rollTheDie2;
                if (playerPositionTwo < 0)
                    playerPositionTwo = 0;
                System.out.println("Snake : " + playerPositionTwo);
            }
        }
        System.out.println("Final position of player1 : " + playerPositionOne);
        System.out.println("Final position of player2 : " + playerPositionTwo);
        System.out.println("Number Of Total Moves : " + moves);

        if (playerPositionOne > playerPositionTwo) {
            System.out.println("PlayerOne Win The Game");
        } else {
            System.out.println("PlayerTwo Win The Game");
        }
    }
}
