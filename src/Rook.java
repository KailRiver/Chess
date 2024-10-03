public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // Rook can move any number of squares horizontally or vertically
        return x1 == x2 || y1 == y2;
    }
}
