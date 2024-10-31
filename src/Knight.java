public class Knight extends ChessPiece {

    public Knight(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "Kn";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (isValidMove(chessBoard, line, colum, toLine, toColum)) {
            return false;
        }

        int deltaLine = Math.abs(line - toLine);
        int deltaColum = Math.abs(colum - toColum);

        return ((deltaLine == 2 && deltaColum == 1) || (deltaLine == 1 && deltaColum == 2));
    }
}