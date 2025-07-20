package chess;

public class Main {

    public static void main(String[] args) {
        
        Pawn pawn = new Pawn("Positive", "Black");
        
        Board board = new Board();
        
        board.placePiece(pawn, 0, 1);
        board.showBoard();
        System.out.println(pawn.getMoveCount());
        
        System.out.println("-------------------------");
        
        board.movePiece(pawn,3, 1);
        board.showBoard();
        System.out.println(pawn.getMoveCount());
        
        board.movePiece(pawn,6, 1);
        board.showBoard();
        System.out.println(pawn.getMoveCount());
        
    }
}
