import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ShatGPTFace extends JFrame implements ActionListener {

    private final JLabel faceLabel;
    private final JLabel strikeLabel;

    private final ImageIcon faceOpen;
    private final ImageIcon faceClosed;
    private final ImageIcon faceAngryClosed;
    private final ImageIcon faceAngryOpen;
    private final ImageIcon faceLoading;
    private final ImageIcon faceThinkingClosed;
    private final ImageIcon faceThinkingOpen;

    private boolean isMouthOpen;
    private boolean isAngry;
    private boolean isThinking;
    private int strikes = 0;

    private final Timer timer;
    private int x = (int)(Math.random() * (100 - 20 + 1)) + 20;
    private int y = (int)(Math.random() * (100 - 20 + 1)) + 20;
    private int xVelocity = (int)(Math.random() * (4 - 1 + 1)) + 1;
    private int yVelocity = (int)(Math.random() * (4 - 1 + 1)) + 1;

    public ShatGPTFace() {
        JFrame frame = new JFrame("ShatGPT");
        frame.setLayout(null);
        faceLabel = new JLabel();
        strikeLabel = new JLabel("Strikes: 0/3");
        strikeLabel.setForeground(Color.GREEN);
        Font font = new Font("font1", Font.BOLD, 50);

        strikeLabel.setFont(font);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        faceLabel.setBounds(x, y, 300, 300);
        strikeLabel.setBounds(10, 400, 290, 50);

        frame.setSize(500, 500);

        faceOpen = new ImageIcon("faces/open.png");
        faceClosed = new ImageIcon("faces/closed.png");
        faceAngryClosed = new ImageIcon("faces/angryclosed.png");
        faceAngryOpen = new ImageIcon("faces/angryopen.png");
        faceLoading = new ImageIcon("faces/loading.png");
        faceThinkingClosed = new ImageIcon("faces/thinkingclosed.png");
        faceThinkingOpen = new ImageIcon("faces/thinkingopen.png");

        frame.setLocation(700,0);
        frame.setAlwaysOnTop(true);
        frame.getContentPane().setBackground(Color.BLACK);
        faceLabel.setIcon(faceClosed);
        frame.add(faceLabel);
        frame.add(strikeLabel);
        frame.setVisible(true);

        timer = new Timer(20, this);

    }

    public void actionPerformed(ActionEvent e) {
        x += xVelocity;
        y += yVelocity;

        if(x <= 0 || x + 315 >= 500) {
            xVelocity = (xVelocity * -1);
        }
        if(y <= 0 || y + 335 >= 500) {
            yVelocity = (yVelocity * -1);
        }

        faceLabel.setLocation(x,y);

    }

    public void flipFace() {
        if(isAngry) {
            if (isMouthOpen) {
                faceLabel.setIcon(faceAngryClosed);
                isMouthOpen = false;
            } else {
                faceLabel.setIcon(faceAngryOpen);
                isMouthOpen = true;
            }
        }
        else if(isThinking) {
            if (isMouthOpen) {
                faceLabel.setIcon(faceThinkingClosed);
                isMouthOpen = false;
            } else {
                faceLabel.setIcon(faceThinkingOpen);
                isMouthOpen = true;
            }
        }
        else {
            if (isMouthOpen) {
                faceLabel.setIcon(faceClosed);
                isMouthOpen = false;
            } else {
                faceLabel.setIcon(faceOpen);
                isMouthOpen = true;
            }
        }
    }

    public void angryFace() {
        isAngry = !isAngry;
    }

    public void loadingFace() {
        faceLabel.setIcon(faceLoading);
    }

    public void bounceStart() {
        timer.start();
    }

    public void bounceStop() {
        timer.stop();
    }
    public void thinkingFace() {
        isThinking = !isThinking;
    }

    public void addStrike() {
        strikes++;
        switch(strikes) {
            case 1:
                strikeLabel.setForeground(Color.YELLOW);
                strikeLabel.setText("Strikes: 1/3");
                break;
            case 2:
                strikeLabel.setForeground(Color.ORANGE);
                strikeLabel.setText("Strikes: 2/3");
                break;
            case 3:
                strikeLabel.setForeground(Color.RED);
                strikeLabel.setText("Strikes: 3/3");
                break;
        }
    }
}
