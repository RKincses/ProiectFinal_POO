import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AdminWindow {
    private JButton alocareComandaButton;
    private JList ListaComenziNealocate;
    private JList ListaSoferi;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel;
    private JPanel panel1;
    public static JFrame AdminFrame = new JFrame("Admin");
    private ArrayList<Soferi> soferi;
    public AdminWindow() {
        ListaComenziNealocate.setListData(PlasareComenzi.arrayComenzi.toArray());
        soferi = new ArrayList<Soferi>();
        File fr = new File("ProiectFinal-POO/src/InfoSoferi");
        Scanner readf;
        try {
            readf = new Scanner(fr);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        while (readf.hasNextLine()) {
            String nume = readf.nextLine();
            String prenume = readf.nextLine();
            String nr_masina = readf.nextLine();
            int id_sofer = Integer.parseInt(readf.nextLine());
            Soferi sofer = new Soferi(nume,prenume,nr_masina,id_sofer);
            soferi.add(sofer);
            alocareComandaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(id_sofer==Integer.parseInt(textField2.getText())){

                    }
                }
            });
        }
        ListaSoferi.setListData(soferi.toArray());
        }
    public static void start(JFrame frame){

        AdminFrame.setSize(800,480);
        AdminFrame.setContentPane(new AdminWindow().panel1);
        AdminFrame.setContentPane(new AdminWindow().panel);
        AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdminFrame.setVisible(true);
        frame.setVisible(false);
    }
}
