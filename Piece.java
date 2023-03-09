/**
    An abstact class Piece that each sub class of pieces will inherit from.
    Each piece has a color, and a getter for that color
    As well as a List of valid moves
 */

public abstract class Piece {

    private final Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract List<Point> getValidMoves(Point currentPos, Piece[][] board);
}