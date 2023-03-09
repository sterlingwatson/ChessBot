import javax.swing.*;
import java.awt.*;

public class ChessGUI extends JFrame {

    private JPanel board;
    private JPanel[][] tiles = new JPanel[8][8];

    public ChessGUI() {
        setTitle("Board");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,640);

        board = new JPanel(new GridLayout(8,8));
        for (int i=0; i<8; i++){
            for( int j=0; j<8; j++){
                JPanel square = new JPanel();
                square.setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.BLACK);
                tiles[i][j] = square;
                board.add(square);
            }
        }

        add(board);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChessGUI();
    }
}