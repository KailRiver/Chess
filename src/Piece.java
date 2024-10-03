public abstract class Piece {
    protected boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract boolean isValidMove(int x1, int y1, int x2, int y2);
}
