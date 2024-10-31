public abstract class ChessPiece {
    protected String color;
    public boolean check;

    public ChessPiece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isValidMove(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (!chessBoard.checkPos(colum) || !chessBoard.checkPos(line)
                || !chessBoard.checkPos(toColum) || !chessBoard.checkPos(toLine)) {
            return true;
        }
        int deltaLine = toLine - line;
        int deltaColum = toColum - colum;

        int stepLine = Integer.signum(deltaLine);
        int stepColum = Integer.signum(deltaColum);

        if (chessBoard.board[toLine][toColum] != null &&
                chessBoard.board[toLine][toColum].getColor().equals(chessBoard.board[line][colum].getColor())) {
            return true;
        }

        int currentLine = line + stepLine;
        int currentColum = colum + stepColum;

        while ((toLine != currentLine) || (toColum != currentColum)) {
            if (chessBoard.board[currentLine][currentColum] != null ) {
                return true;
            }
            currentLine += stepLine;
            currentColum += stepColum;
        }
        return ((line == toLine) && (colum == toColum));
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum);

    public abstract String getSymbol();
}