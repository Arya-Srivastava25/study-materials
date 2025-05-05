package Board;

import Piece.PlayingPiece;

public class Board {
    private int size;
    private PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }
}
