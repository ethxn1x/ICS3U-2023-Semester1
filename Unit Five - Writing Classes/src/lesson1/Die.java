package lesson1;

public class Die {
    private int topSide;
    private int numSides;

    public Die(int numSides){
        this.numSides = 6;
        roll();
    }
    
    public void roll(){

        topSide = (int)(Math.random() * numSides) + 1;
    }

    public int getTopSide(){
        return topSide;
    }

    public void setTopSide(int topSide){
        if(topSide > numSides){
            throw new IllegalArgumentException("Cannot Have a side larger than " + numSides);
        }
        this.topSide = topSide;
    }
}
