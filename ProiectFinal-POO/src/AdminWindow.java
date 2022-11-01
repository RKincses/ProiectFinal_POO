import javax.swing.*;

public class AdminWindow {
    private JButton alocareComandaButton;
    private JList ListaComenziNealocate;
    private JList ListaSoferi;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel;
    private JPanel panel1;

    public static JFrame AdminFrame = new JFrame("Admin");

    public static void start(JFrame frame){

        AdminFrame.setSize(400,450);
        AdminFrame.setContentPane(new AdminWindow().panel1);
        AdminFrame.setContentPane(new AdminWindow().panel);
        AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdminFrame.setVisible(true);
        frame.setVisible(false);
    }
}
