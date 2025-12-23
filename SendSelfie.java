import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SendSelfie {
    public static void main(String[] args) {
        String imagePath = "qaiyumselfie.jpg";
        BufferedImage img = null;
        
        try {
            img = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.err.println("Sorry, I can't do that. I'm busy right now!");
            return;
        }

        JFrame frame = new JFrame("Image Viewer");
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
