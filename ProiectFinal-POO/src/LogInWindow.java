import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LogInWindow {
    private JPanel panel1;
    private JButton confirmButton;
    private JCheckBox adminCheckBox;
    private JCheckBox livratorCheckBox;
    private JTextField usernameTextField;
    private JPasswordField passwordPasswordField;

    public LogInWindow() {
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameTextField.getText();
                String password = passwordPasswordField.getText();
                if (adminCheckBox.isSelected()) {
                    File fr = new File("ProiectFinal-POO/src/DateLogareAdmin");
                    Scanner readf;
                    try {
                        readf = new Scanner(fr);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    boolean ok = true;
                    while (readf.hasNextLine() && ok) {
                        String dataUser = readf.nextLine();
                        String dataPass = readf.nextLine();
                        if (dataPass.equals(password) && dataUser.equals(username)) {
                            ok = false;
                        }
                    }
                }
                if (livratorCheckBox.isSelected()) {
                    File fr = new File("ProiectFinal-POO/src/DateLogareLivrator");
                    Scanner readf;
                    try {
                        readf = new Scanner(fr);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    boolean ok = true;
                    while (readf.hasNextLine() && ok) {
                        String dataUser = readf.nextLine();
                        String dataPass = readf.nextLine();
                        if (dataPass.equals(password) && dataUser.equals(username)) {
                            ok = false;
                        }
                    }
                }
            }
        });
    }
}
