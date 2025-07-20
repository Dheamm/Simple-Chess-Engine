package chess;

public class Board {
    private Piece[][] board;
    
    public Board(){
        
        board = new Piece[8][8];
    }
    
    public void placePiece(Piece piece, int row, int column) {
        board[row][column] = piece;
        piece.setRow(row);
        piece.setColumn(column);
    }
    
    public Piece getPiece(int row, int column){
        return board[row][column];
    }
    
    public void movePiece(Piece piece, int destRow, int destColumn){
        if (piece.isValidMove(destRow, destColumn)) {
                board[piece.getRow()][piece.getColumn()] = null;
                 placePiece(piece, destRow, destColumn);
                 piece.incrementMoveCount();
        }
        else {
            System.out.println(piece+": Invalid move!");
        }
    }
    
    public void showBoard() {
//        System.out.println("  A  B  C  D  E  F  G  H");
        System.out.println("  0  1  2  3  4  5  6  7"); 

        for (int row = 0; row < 8; row++) {
            System.out.print(row + " "); 
            for (int column = 0; column < 8; column++) {
                Piece piece = board[row][column];
                if (piece == null) {
                    System.out.print(".  ");
                } else {
                    System.out.print(piece + " ");
                }
            }
            System.out.println();
        }
    }
}
