package boardgame;

public class Board {
	private int rows;
	private int columns;
	protected Piece[][] pieces;
	
	public Board (int rows, int columns) {
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}
	
}
