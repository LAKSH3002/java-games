import javax.swing.*;

public class brickbreak_main
{
    public static void main(String[] args) {
        JFrame j = new JFrame();
        brick_gamePlay game = new brick_gamePlay();
        j.setBounds(300,100,700,400);
        j.setTitle("BRICK BALL");
        j.setResizable(false);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(game);
    }
}
