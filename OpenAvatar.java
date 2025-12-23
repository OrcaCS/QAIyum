import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenAvatar {
    public static void main(String[] args) {
        try {
            File file = new File("qaiyumavatar.jpg");

            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(file);
            }
        } catch (IOException e) {
            System.err.println("Couldn't open avatar.");
        }
    }
}
