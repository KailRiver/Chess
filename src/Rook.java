public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (isValidMove(chessBoard, line, colum, toLine, toColum)) {
            return false;
        }
        return line == toLine || colum == toColum;
    }
}
