package chess;

public class Pawn extends Piece {
    
    private String polarity;
    
    public Pawn(String polaridad, String color) {
        super(color);
        this.polarity = polaridad;
    }

    public String getPolarity() {
        return polarity;
    }

    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }
   
    @Override
    public boolean isValidMove(int destRow, int destColumn){
        if (getColumn() != destColumn){
            System.out.println("The pawn can only move vertically.");
            return false;
        }
        
        int moveDistance = (destRow-getRow());
        
        if (getPolarity().equals("Positive")) {
            if (moveDistance <= 0) {
                System.out.println("The pawn cannot move backward.");
                return false;
            }

            if (moveDistance == 1) {
                return true; // normal move
            }

            if (moveDistance == 2 && getMoveCount() == 0) {
                return true; // first move double
            }

            System.out.println("Invalid move for pawn.");
            return false;
    }

        if (getPolarity().equals("Negative")) {
            if (moveDistance >= 0) {
                System.out.println("The pawn cannot move backward.");
                return false;
            }

            if (moveDistance == -1) {
                return true;
            }

            if (moveDistance == -2 && getMoveCount() == 0) {
                return true;
            }

            System.out.println("Invalid move for pawn.");
            return false;
        }
        
        System.out.println("Unknown polarity.");
        return false;
    }
       
    @Override
    public String toString(){
        return "P" + (getColor().equals("White") ? "W" : "B");
    }
}
