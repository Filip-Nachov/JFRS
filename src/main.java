//  imports
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String TITLE = "Totem Protector"; 
        Image icon = null;
        
        try {
            icon = ImageIO.read(new File("data/Old-Totem.png"));
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }

        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());
        

        if (icon != null) {
            window.setIconImage(icon);
        }

        GamePanel GP = new GamePanel();
        window.add(GP);
        window.pack(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle(TITLE);
        window.setLocationRelativeTo(null); // Center the window
        window.setVisible(true);
    }
}
