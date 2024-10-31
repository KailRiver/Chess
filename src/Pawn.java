public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (isValidMove(chessBoard, line, colum, toLine, toColum)) {
            return false;
        }
        int deltaLine = line - toLine;
        int deltaColum = colum - toColum;
        if (color.equals("White")) {
            if ((line == 1 && (deltaLine == -1 || deltaLine == -2))) {
                return true;
            }
            return deltaLine == -1;
        } else if (color.equals("Black")) {

            if ((line == 6 && (deltaLine == 1 || deltaLine == 2))) {
                return true;
            }
            return deltaLine == 1;
        }
        return false;
    }
}