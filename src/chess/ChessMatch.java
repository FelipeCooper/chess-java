package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch(){
		board = new Board( 8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j=0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialSetup() {
		Color color = Color.BLACK;
		int j = 0;
		for(int i = 0; i<board.getColumns();i++) {
			board.placePiece(new Pawn(board,Color.BLACK), new Position(1,i));
		}
		for(int i = 0; i<board.getColumns();i++) {
			board.placePiece(new Pawn(board,Color.WHITE), new Position(6,i));
		}
		for (int i=0; i <= 1; i++) {
			
			board.placePiece(new Rook(board,color), new Position(j,0));
			board.placePiece(new Knight(board,color), new Position(j,1));
			board.placePiece(new Bishop(board,color), new Position(j,2));
			board.placePiece(new Queen(board,color), new Position(j,3));
			board.placePiece(new King(board,color), new Position(j,4));
			board.placePiece(new Bishop(board,color), new Position(j,5));
			board.placePiece(new Knight(board,color), new Position(j,6));
			board.placePiece(new Rook(board,color), new Position(j,7));
			j = 7;
			color = Color.WHITE;
		}
		
		
	}
	
	
}
