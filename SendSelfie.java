import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SendSelfie {
    public static void main(String[] args) {
        String imagePath;
        double random = Math.random();
        
        if (random <=  0.24) {
            imagePath = "qaiyumselfie1.jpg";
        } else if ((random >  0.24) && (random <=  0.49)) {
            imagePath = "qaiyumselfie2.jpg";
        } else if ((random >  0.49) && (random <=  0.74)) {
            imagePath = "qaiyumselfie3.jpg";
        } else {
            imagePath = "qaiyumselfie4.jpg";
        }
        
        BufferedImage img = null;
        
        try {
            img = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.err.println("Sorry, your crappy device can't receive images. And I'm also busy right now.");
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
