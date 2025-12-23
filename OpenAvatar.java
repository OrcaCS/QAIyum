import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class OpenAvatar {
    public static void main(String[] args) {
        String imagePath = "src/qaiyumavatar.png";
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            System.err.println(
                    "\nCould not open avatar. Wow! Looks like your device is so crappy that you can't even see me. What are you chatting with me on, a potato??");
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
