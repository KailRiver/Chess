public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int x1, int y1, int x2, int y2) {
        // Knight can move two squares in one direction, then one square in a perpendicular direction
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
