package chess;

public class Main {

    public static void main(String[] args) {
        
        Pawn pawn = new Pawn("Positive", "Black");
        Pawn pawn2 = new Pawn("Negative", "White");
        
        Rook rook = new Rook("Black");
        
        Board board = new Board();
        
        board.placePiece(pawn, 0, 1);
        board.placePiece(pawn, 0, 2);
        board.placePiece(pawn2, 1, 3);
        board.placePiece(rook, 0,3);

        System.out.println(board.getPiece(1,3));
        board.showBoard();
        
        System.out.println("-------------------------");
        
        board.movePiece(rook, 1,3);
        System.out.println(board.getPiece(1,3));
        board.showBoard();
        
        System.out.println("-------------------------");
        
        board.movePiece(rook, 7, 3);
        
        board.showBoard();
    }
}
