package UC_3;

public class SnakeAndLadder {
    public void optionCheck() {
        System.out.println("----Welcome To Snake And Ladder Simulator----");
        //UC_1 Initialize Start Position
        int startPosition = 0;
        System.out.println("PlayerOne Starts At Position : " + startPosition);

        //UC_2 Rolls The Die Randomly
        int rollTheDie = (int) (Math.floor(Math.random() * 10) % 6) + 1;
        System.out.println("Roll the Dice : " + rollTheDie);

        //UC_3 CheckForOption NoPlay, Ladder, Snake
        int checkOptions = (int) (Math.floor(Math.random() * 10) % 3);
        if(checkOptions == 0){
            System.out.println("No Play");
        }
        else if (checkOptions == 1){
            System.out.println("Ladder: Player Moves Ahead");
        }
        else {
            System.out.println("Snake: Player Moves Behind");
        }
    }
}
