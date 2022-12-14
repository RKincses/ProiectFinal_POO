import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class AdminWindow {
    private JButton alocareComandaButton;
    private JList ListaComenziNealocate;
    private JList ListaSoferi;
    private JTextField IDComandaTextField;
    private JTextField IDSoferTextField;
    private JPanel panel;
    private JPanel panel1;
    private JButton inapoiButton;
    public static JFrame AdminFrame = new JFrame("Admin");
    private ArrayList<Soferi> soferi;
    public AdminWindow() {
        String nume;
        String prenume;
        String nr_masina;
        int id_sofer = 0;
        Soferi sofer;
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
            nume = readf.nextLine();
            prenume = readf.nextLine();
            nr_masina = readf.nextLine();
            id_sofer = Integer.parseInt(readf.nextLine());
            sofer = new Soferi(nume,prenume,nr_masina,id_sofer);
            soferi.add(sofer);
            try {
                File myObj = new File(String.valueOf(id_sofer));
                myObj.createNewFile();
            } catch (IOException e) {
                System.out.println("Error!");
                e.printStackTrace();
            }
        }
        ListaSoferi.setListData(soferi.toArray());
        alocareComandaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int finalId_sofer = Integer.parseInt(IDSoferTextField.getText()) ;
                for(int i = 0; i < PlasareComenzi.arrayComenzi.size(); i++)
                {
                    if(PlasareComenzi.arrayComenzi.get(i).getId_comanda() == Integer.parseInt(IDComandaTextField.getText()))
                    {
                        PlasareComenzi.arrayComenzi.get(i).setId_livrator(finalId_sofer);
                    }
                }
                /*
                try {

                    FileWriter myWriter = new FileWriter(String.valueOf(finalId_sofer));
                    for(int i = 0; i < PlasareComenzi.arrayComenzi.size(); i++)
                    {
                        if(PlasareComenzi.arrayComenzi.get(i).getId_comanda() == Integer.parseInt(IDComandaTextField.getText()))
                        {
                            myWriter.write(PlasareComenzi.arrayComenzi.get(i).toString2());
                        }
                    }
                    myWriter.close();
                } catch (IOException ie) {
                    System.out.println("Eroare!");
                    ie.printStackTrace();
                }
                 */
            }
        });
        inapoiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlasareComenzi.frame.setVisible(true);
                AdminFrame.setVisible(false);
            }
        });
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
