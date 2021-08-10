package util;

import java.awt.*;
import javax.swing.*;




/*Realice una aplicación que permita,
 leer un registro de datos desde una base de datos con JDBC (CRUD 2) y los imprima por una interfaz swing*/

public class EjercicioenClase229 {

    public static void main(String[] args){
    JFrame frame = new JFrame("Elmo es el Rey");
    JPanel panel = new JPanel();
    JTextField textField = new JTextField("Texto por defecto");
    JButton button = new JButton("Pulsame!");
    Container contentPane = frame.getContentPane();
    panel.add(textField);
    panel.add(button);
/* add components to contentPane- BorderLayout */
    contentPane.add(panel, BorderLayout.CENTER);
    frame.pack(); //Size of frame based on components
    frame.setVisible(true);
    

   
}
}
