public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
        initBoard();
    }

    private void initBoard() {
        // Initialize the board
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 1) {
                    board[i][j] = new Pawn(true); // White pawns
                } else if (i == 6) {
                    board[i][j] = new Pawn(false); // Black pawns
                } else if (i == 0) {
                    if (j == 0 || j == 7) {
                        board[i][j] = new Rook(true); // White rooks
                    } else if (j == 1 || j == 6) {
                        board[i][j] = new Knight(true); // White knights
                    } else if (j == 2 || j == 5) {
                        board[i][j] = new Bishop(true); // White bishops
                    } else if (j == 3) {
                        board[i][j] = new Queen(true); // White queen
                    } else if (j == 4) {
                        board[i][j] = new King(true); // White king
                    }
                } else if (i == 7) {
                    if (j == 0 || j == 7) {
                        board[i][j] = new Rook(false); // Black rooks
                    } else if (j == 1 || j == 6) {
                        board[i][j] = new Knight(false); // Black knights
                    } else if (j == 2 || j == 5) {
                        board[i][j] = new Bishop(false); // Black bishops
                    } else if (j == 3) {
                        board[i][j] = new Queen(false); // Black queen
                    } else if (j == 4) {
                        board[i][j] = new King(false); // Black king
                    }
                }
            }
        }
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    public void movePiece(int x1, int y1, int x2, int y2) {
        Piece piece = board[x1][y1];
        if (piece != null && piece.isValidMove(x1, y1, x2, y2)) {
            board[x1][y1] = null;
            board[x2][y2] = piece;
        }
    }
}
