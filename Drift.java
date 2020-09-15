import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Drift {

    static JFrame f;
    static Display d = new Display();
    static Car car;

    public static void main(String[] args){

        car = new Car();

        f = new JFrame();
        f.setSize(1600,1000);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(d);

        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                car.GasGasGas();
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        while(true){
            try {

                Thread.sleep(10);

                d.repaint();
                d.revalidate();

                car.update();

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("funkar inte");
            }
        }

    }
}
