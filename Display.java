import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Display extends JPanel {

    Image img;

    public Display() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        System.out.println(3945678);

        try {
            img = ImageIO.read(new File("src/car.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ingen bild");
            System.exit(0);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for(int i=0; i<18; i++) {
            for (int j = 0; j < 12; j++) {
                g.fillRect(i * 100, j * 100, 2, 2);
            }
        }
        g.drawImage(img,Drift.car.x,Drift.car.y,50,100,this);

    }

}
