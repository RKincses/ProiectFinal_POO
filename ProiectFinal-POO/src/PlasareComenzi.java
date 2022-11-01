import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class PlasareComenzi {
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

    }
}
