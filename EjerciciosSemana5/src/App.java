import java.awt.event.*;
import javax.swing.*;

/*Elaboro Leonardo Ramirez
Grupo 60
realice un programa que permita mostrar un jframe con dos botones
y dos textfield donde al hacer clic me muestre "bienvenido" "estudiante"; cada palabra en cada textfield*/

public class App {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Exercise");
        final JTextField tf = new JTextField();
        tf.setBounds(40, 50, 160, 20);
        final JTextField tf1 = new JTextField();
        tf1.setBounds(220, 50, 160, 20);
        JButton b = new JButton("Click 1");
        b.setBounds(40, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Bienvenido Estudiante");
            }
        });
        JButton b1 = new JButton("Click 2");
        b1.setBounds(220, 100, 95, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("Bienvenido Estudiante No. 1");
            }
        });

        f.add(b);
        f.add(tf);
        f.add(b1);
        f.add(tf1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    }

