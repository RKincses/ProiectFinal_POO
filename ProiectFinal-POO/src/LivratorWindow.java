import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivratorWindow {
    private JList ComenziSofer;
    private JPanel panel1;
    private JTextField IDLivratorTextField;
    private JButton afiseazaComenziButton;
    private JButton inapoiButton;
    public static  JFrame LivratorFrame = new JFrame("Livrator");
    public LivratorWindow() {
        afiseazaComenziButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    for(int i = 0; i < PlasareComenzi.arrayComenzi.size(); i++){
                        if(PlasareComenzi.arrayComenzi.get(i).getId_livrator() == Integer.parseInt(IDLivratorTextField.getText())){
                            ComenziSofer.setListData(PlasareComenzi.arrayComenzi.get(i).toString2());
                        }
                    }
                }
            }
        });
        inapoiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlasareComenzi.frame.setVisible(true);
                LivratorFrame.setVisible(false);
            }
        });
    }

    public static void start(JFrame frame){

        LivratorFrame.setSize(400,450);
        LivratorFrame.setContentPane(new LivratorWindow().panel1);
        LivratorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LivratorFrame.setVisible(true);
        frame.setVisible(false);
    }
}
