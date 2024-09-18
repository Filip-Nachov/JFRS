// imports
import  javax.swing.JFrame;
import java.awt.FlowLayout;

class Main {
    public static void main(String[] args) {
        String TITLE = "Totem Protector"; 

        JFrame window = new JFrame();
        window.setLayout(new FlowLayout());

        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setTitle(TITLE);
        window.setSize(500, 500);
        window.setVisible(true);
    }
}