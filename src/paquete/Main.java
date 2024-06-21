package paquete;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(400, 400);
        ventana.setTitle("TITULOOOOS");

        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits when the window is closed

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.BLUE);

        JLabel label = new JLabel("2024-06-21");
        contenedor.add(label);

        JTextField campo1 = new JTextField();
        contenedor.add(campo1);

        ventana.add(contenedor);
        ventana.setVisible(true);
    }
}
