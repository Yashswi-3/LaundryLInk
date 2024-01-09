import java.awt.*;
import javax.swing.*;

public class Creators {
    public static void main(String[] args) {
        JFrame frame = new JFrame("About Us");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel content = new JLabel("<html><center>About the Creators</center><br>Insert information about the creators here.</html>", SwingConstants.CENTER);
        content.setFont(new Font("Serif", Font.PLAIN, 18));
        frame.add(content, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}