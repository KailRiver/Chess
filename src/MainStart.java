public class MainStart {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        // Move a piece
        board.movePiece(1, 1, 2, 2);
        // Get a piece
        Piece piece = board.getPiece(2, 2);
        System.out.println(piece.isValidMove(2, 2, 3, 3));
    }
}
