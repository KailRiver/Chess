public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (isValidMove(chessBoard, line, colum, toLine, toColum)) {
            return false;
        }
        int deltaLine = Math.abs(line - toLine);
        int deltaColum = Math.abs(colum - toColum);

        return (deltaColum == deltaLine);
    }
}