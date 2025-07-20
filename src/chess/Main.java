package chess;

public class Main {

    public static void main(String[] args) {
        
        Pawn pawn = new Pawn("Positive", "Black");
        Rook rook = new Rook("Black");
        
        Board board = new Board();
        
        board.placePiece(pawn, 0, 1);
        board.placePiece(rook, 0,3);
        board.showBoard();
        
        System.out.println("-------------------------");
        
        board.movePiece(pawn,2, 1);
        board.movePiece(rook, 4,2);
        board.showBoard();
        
        System.out.println("-------------------------");
        
        board.movePiece(pawn,3, 1);
        board.movePiece(rook, 7, 3);
        
        board.showBoard();
    }
}
