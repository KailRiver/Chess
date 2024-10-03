public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // King can move one square in any direction
        return Math.abs(x2 - x1) <= 1 && Math.abs(y2 - y1) <= 1;
    }
}
