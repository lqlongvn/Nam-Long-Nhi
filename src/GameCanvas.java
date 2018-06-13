import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {

//    Mô tả đối tượng được vẽ lên Canvas

    public GameCanvas() {
        this.setSize(1024, 600);

//        load image của các đối tượng được vẽ

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1024, 600);
//  Vẽ các đối tượng
    }
}
