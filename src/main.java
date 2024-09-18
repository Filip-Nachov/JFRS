// imports
import  javax.swing.JFrame;
import java.awt.FlowLayout;

class Main {
    public static void main(String[] args) {
        String TITLE = "Totem Protector"; 
        int width = 800;
        int height = 650;

        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());

        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setTitle(TITLE);
        window.setSize(width, height);
        window.setVisible(true);
    }
}