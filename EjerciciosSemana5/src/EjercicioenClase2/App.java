package EjercicioenClase2;

import javax.swing.*;
import java.awt.*;

/*Realizar un programa que permita solicitar datos desde un formulario de jframe;
 al menos tres datos, que realice una operación y devuelva el resultado por un jframe*/

public class App {
    public static void main(String args[]) {
    JFrame f = new JFrame("Solicitud Datos");

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400, 400);

     // Creando el panel en la parte inferior
     JPanel panel = new JPanel();
     JLabel label = new JLabel("Introducir Numero 1");
     JTextField tf = new JTextField(10);
     JButton send = new JButton("Enviar");
     JButton reset = new JButton("Restablecer");
     panel.add(label);
     panel.add(tf);
     panel.add(send);
     panel.add(reset);

     JPanel panel1 = new JPanel();
     JLabel label1 = new JLabel("Introducir Numero 2");
     JTextField tf1 = new JTextField(10);
     JButton send1 = new JButton("Enviar");
     JButton reset1 = new JButton("Restablecer");
     panel.add(label1);
     panel.add(tf1);
     panel.add(send1);
     panel.add(reset1);

     JPanel panel2 = new JPanel();
     JLabel label2 = new JLabel("Introducir Numero 3");
     JTextField tf2 = new JTextField(10);
     JButton send2 = new JButton("Enviar");
     JButton reset2 = new JButton("Restablecer");
     panel.add(label2);
     panel.add(tf2);
     panel.add(send2);
     panel.add(reset2);

     f.getContentPane().add(BorderLayout.NORTH, panel);
     f.getContentPane().add(BorderLayout.CENTER, panel1);
     f.getContentPane().add(BorderLayout.CENTER, panel2);

     //f.getContentPane().add(BorderLayout.NORTH, mb);
     //f.getContentPane().add(BorderLayout.CENTER, ta);
     f.setVisible(true);


    
}
}
