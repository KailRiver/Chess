public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // Pawn can move forward one square, but captures diagonally
        if (isWhite) {
            return (x2 == x1 + 1 && y2 == y1) || (x2 == x1 + 1 && Math.abs(y2 - y1) == 1);
        } else {
            return (x2 == x1 - 1 && y2 == y1) || (x2 == x1 - 1 && Math.abs(y2 - y1) == 1);
        }
    }
}
