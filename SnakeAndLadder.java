package UC_2;

public class SnakeAndLadder {
    public void rollsTheDice() {
        System.out.println("----Welcome To Snake And Ladder Simulator----");
        //UC_1 Initialize Start Position
        int startPosition = 0;
        System.out.println("PlayerOne Starts At Position : " +startPosition);

        //UC_2 Rolls The Die Randomly
        int rollTheDie = (int)(Math.floor(Math.random()*10)%6)+1;
        System.out.println(rollTheDie);
    }
}
