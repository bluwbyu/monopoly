package monopoly;

public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public void takeTurn() {
        int fvTotal = 0;
        for (Die dice : dice) {
            dice.roll();
//            int fv = dice.getFaceValue();
//            fvTotal += fv;
            fvTotal += dice.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTotal);
        piece.setLocation(newLoc);
    }
}
