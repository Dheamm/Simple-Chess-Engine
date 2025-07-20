
package chess;

public class Rook extends Piece {

    public Rook(String color) {
        super(color);
    }
    
    @Override
    public boolean isValidMove(int destRow, int destColumn){
        if (getColumn() != destColumn && getRow() != destRow){
            System.out.println("The rook can only move straight.");
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "R" + (getColor().equals("White") ? "W" : "B");
    }
    
}
