// imports
import  javax.swing.JFrame;
import java.awt.FlowLayout;

class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("JFRS");
        window.setLayout(new FlowLayout());

        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.pack();

        window.setSize(500, 500);
        window.setVisible(true);
    }
}