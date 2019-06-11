package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		System.out.print("Chess game init");
			ChessMatch chessmatch= new ChessMatch();
			UI.printboard(chessmatch.getPieces());
	}

}
