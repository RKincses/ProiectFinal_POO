import javax.swing.*;
import java.io.IOException;
import java.io.FileWriter;
public class LivratorWindow {
    private JList ComenziSofer;
    private JPanel panel1;
    private JTextField IDComandaTextField;
    private JButton comandaLivrataButton;
    public static  JFrame LivratorFrame = new JFrame("Livrator");
    public static void start(JFrame frame){

        LivratorFrame.setSize(400,450);
        LivratorFrame.setContentPane(new LivratorWindow().panel1);
        LivratorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LivratorFrame.setVisible(true);
        frame.setVisible(false);
    }
}
