public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // Bishop can move any number of squares diagonally
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}