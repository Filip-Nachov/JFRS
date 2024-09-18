// imports
import  javax.swing.JFrame;
import java.awt.FlowLayout;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFRS");
        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}