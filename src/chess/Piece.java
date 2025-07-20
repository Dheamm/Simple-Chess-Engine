package chess;

public abstract class Piece {
    private String color;
    private int row;
    private int column;
    private int moveCount;
    

    public Piece(String color) {
        this.color = color;
        this.moveCount = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getColumn(){
        return column;
    }
    
    public void setRow(int newRow){
        this.row = newRow;
    }
    
    public void setColumn(int newColumn){
        this.column = newColumn;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int newMoveCount) {
        this.moveCount = newMoveCount;
    }
    
    public void incrementMoveCount() {
        this.moveCount++;
    }

    public String getPosition(){
        return Integer.toString(getRow()) + Integer.toString(getColumn());
    }
    
    public boolean isValidMove(int destRow, int destColumn){
        return true;
    }

}
