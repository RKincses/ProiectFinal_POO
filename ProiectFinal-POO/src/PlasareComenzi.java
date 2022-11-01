import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class PlasareComenzi {
    private JPanel panel;
    private JTextField numeTextField;
    private JTextField nrTelefonTextField;
    private JTextField judetTextField;
    private JTextField localitateTextField;
    private JTextField codPostalTextField;
    private JTextField adresaTextField;
    private JTextField numeTextField1;
    private JTextField nrTelefonTextField1;
    private JTextField judetTextField1;
    private JTextField localitateTextField1;
    private JTextField codPostalTextField1;
    private JTextField adresaTextField1;
    private JButton confirmaComandaButton;
    private JButton logInButton;
    private JPanel panel1;
    private ArrayList<Persoana> arrayExp;
    private ArrayList<Persoana> arrayDest;
    public StringBuffer buffer = new StringBuffer();
    public PlasareComenzi() {
        buffer.append("Toate ");
        buffer.append("campurile ");
        buffer.append("sunt ");
        buffer.append("obligatorii!");
        arrayExp = new ArrayList<Persoana>();
        arrayDest = new ArrayList<Persoana>();
        confirmaComandaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (nrTelefonTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (judetTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (localitateTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (codPostalTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (adresaTextField.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (numeTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (nrTelefonTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (judetTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (localitateTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (codPostalTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                else if (adresaTextField1.getText().isEmpty()) JOptionPane.showMessageDialog(null, buffer);
                String nume = numeTextField.getText();
                String nrTelefon = nrTelefonTextField.getText();
                String judet = judetTextField.getText();
                String localitate = localitateTextField.getText();
                String codPostal = codPostalTextField.getText();
                String adresa = adresaTextField.getText();
                Persoana exp = new Persoana(nume, nrTelefon, judet, localitate, codPostal, adresa);
                arrayExp.add(exp);

                String nume1 = numeTextField1.getText();
                String nrTelefon1 = nrTelefonTextField1.getText();
                String judet1 = judetTextField1.getText();
                String localitate1 = localitateTextField1.getText();
                String codPostal1 = codPostalTextField1.getText();
                String adresa1 = adresaTextField1.getText();
                Persoana dest = new Persoana(nume1, nrTelefon1, judet1, localitate1, codPostal1, adresa1);
                arrayDest.add(dest);
            }
        });
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Plasare Comanda");
        frame.setContentPane(new PlasareComenzi().panel);
        frame.setContentPane(new PlasareComenzi().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
