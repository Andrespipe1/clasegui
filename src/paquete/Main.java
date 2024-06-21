package paquete;
import javax.swing.*;
public class Main {
    public static void main (String[] args){
        JFrame ventana = new JFrame();
        ventana.setSize(400,400);
        ventana.setVisible(true);
        ventana.setTitle("TITULOOOOS");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
        JLabel label = new JLabel("2024-06-21");
        ventana.getContentPane().add(label);

        JTextField campo1 = new JTextField();
        ventana.getContentPane().add(campo1);
    }
}
