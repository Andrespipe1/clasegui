import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class bienvenida {
    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton enviarButton;
    private JTextField textField3;
    private JRadioButton aceptaLosTerminosYRadioButton;
    private JTextField alguienExampleComTextField;
    private JButton cancelarButton;


    public bienvenida() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}