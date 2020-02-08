package homework_8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    static int counter = 0;
    boolean iswin = false;
    static Random magic = new Random();
    int truew = magic.nextInt(2);
    int truef = magic.nextInt(2);

    public Window() {
        JFrame window = new JFrame("Find your BROOM");
        window.setSize(500, 500);
        window.setLocation(700, 300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JButton[][] btns = new JButton[3][3];
        window.add(panel);
        ImageIcon fin = new ImageIcon("src/homework_8/png/018-alchemy.png");
        ImageIcon truemag = new ImageIcon("src/homework_8/png/016-witch broom.png");
        ImageIcon[][] img = new ImageIcon[3][3];
        img[0][0] = new ImageIcon("src/homework_8/png/009-magic show.png");
        img[0][1] = new ImageIcon("src/homework_8/png/005-magic potion.png");
        img[0][2] = new ImageIcon("src/homework_8/png/001-magic pot.png");
        img[1][0] = new ImageIcon("src/homework_8/png/007-bunny hat.png");
        img[1][1] = new ImageIcon("src/homework_8/png/011-mortar.png");
        img[1][2] = new ImageIcon("src/homework_8/png/014-skull.png");
        img[2][0] = new ImageIcon("src/homework_8/png/014-skull.png");
        img[2][1] = new ImageIcon("src/homework_8/png/017-pigeon.png");
        img[2][2] = new ImageIcon("src/homework_8/png/019-candle.png");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btns[i][j] = new JButton(fin);
                int finalI = i;
                int finalJ = j;
                int imagic = magic.nextInt(2);
                int jmagic = magic.nextInt(2);
                btns[i][j].addActionListener(e -> {
                    if (finalI == truew & finalJ == truef) {
                        btns[finalI][finalJ].setIcon(truemag);
                        btns[finalI][finalJ].setEnabled(true);
                        JFrame win = new JFrame("THAT'S YOUR BROOM!");
                        iswin = true;
                        win.setSize(400, 150);
                        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        win.setLocation(750, 350);
                        JButton start = new JButton("Search again?");
                        start.addActionListener(action -> {
                            new Window();
                            win.dispose();
                            counter = 0;
                        });
                        win.add(start);
                        win.setResizable(false);
                        win.setVisible(true);
                    } else {
                        btns[finalI][finalJ].setIcon(img[imagic][jmagic]);
                        btns[finalI][finalJ].setEnabled(false);
                    }
                    counter++;
                    if (counter == 4 & iswin == false) {
                        for (int k = 0; k < 3; k++) {
                            for (int n = 0; n < 3; n++) {
                                btns[k][n].setEnabled(false);
                            }
                        }
                        JFrame dialog = new JFrame("You missed your BROOM!");
                        dialog.setSize(400, 150);
                        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        dialog.setLocation(750, 350);
                        JButton start = new JButton("Again than...");
                        start.addActionListener(action -> {
                            new Window();
                            dialog.dispose();
                            counter = 0;
                        });
                        dialog.add(start);
                        dialog.setResizable(false);
                        dialog.setVisible(true);
                    }
                });
                panel.add(btns[i][j]);
            }
        }
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}