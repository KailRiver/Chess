public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();

    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int colum, int toLine, int toColum) {
        if (isValidMove(chessBoard, line, colum, toLine, toColum)) {
            return false;
        }
        int deltaLine = Math.abs(line - toLine);
        int deltaColum = Math.abs(colum - toColum);

        return (deltaLine <= 1 && deltaColum <= 1);
    }

    public boolean isUnderAttack(ChessBoard board, int line, int colum) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessPiece piece = board.board[i][j];
                if (piece != null && !piece.getColor().equals(getColor())) {
                    if (piece.canMoveToPosition(board, line, colum, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}