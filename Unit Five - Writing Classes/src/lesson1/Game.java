package lesson1;

public class Game {
    public static void main(String[] args){
        Die die1 = new Die();
        Die die2 = new Die();

        int die1Wins = 0;
        int die2Wins = 0;
        int dieTies = 0;

        for(int i = 0; i<1000; i++){
            die1.roll();
            die2.roll();

            if(die1.getTopSide() > die2.getTopSide())
                die1Wins++;
            else if(die2.getTopSide() > die1.getTopSide())
                die2Wins++;
            else
                dieTies++;
        }
    }
}
