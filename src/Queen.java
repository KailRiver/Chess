public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // Queen can move any number of squares in any direction (horizontally, vertically, or diagonally)
        return x1 == x2 || y1 == y2 || Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}
