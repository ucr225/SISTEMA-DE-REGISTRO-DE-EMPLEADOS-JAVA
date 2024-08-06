package Programa;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class lectura extends JFrame {
    private JPanel contentPane;
    private JLabel etiquetaSaludo;
    private JTextField textField;

    public lectura() {
        // Creando el content pane
        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(255, 255, 128), 6));
        setBounds(100, 100, 1056, 680);
        setTitle("VISUALIZACION DE EMPLEADOS");
        setResizable(false);
        contentPane.setBackground(new Color(25, 34, 41));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        setResizable(false);
        
        // Configurar la operación de cierre
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
        
        
        
        
        //
        etiquetaSaludo = new JLabel("VISUALIZACION DE LA BASE DE DATOS");
        etiquetaSaludo.setForeground(new Color(239, 243, 245));
        etiquetaSaludo.setOpaque(true);
        etiquetaSaludo.setBackground(new Color(25, 34, 41));
        etiquetaSaludo.setFont(new Font("Roboto Black", Font.ITALIC, 24));
        etiquetaSaludo.setBounds(322, 33, 450, 50);
        etiquetaSaludo.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(etiquetaSaludo);
        
        // Separador para el nombre - apellido
        JSeparator separatorApellido = new JSeparator();
        separatorApellido.setForeground(new Color(160, 167, 172));
        separatorApellido.setBounds(73, 152, 914, 2);
        contentPane.add(separatorApellido);
        
        
        // Botón "BORRAR TODO"
        JButton botonBorrar = new JButton("BORRAR EMPLEADO");
        botonBorrar.setFont(new Font("Roboto Black", Font.PLAIN, 22));
        botonBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonBorrar.setOpaque(true);
        botonBorrar.setForeground(Color.WHITE);
        botonBorrar.setBackground(Color.RED);
        botonBorrar.setBounds(745, 550, 250, 40);
        botonBorrar.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(botonBorrar);


        // Botón "CARGAR EMPLEADO"
        JButton botonCargar = new JButton("VOLVER AL MENU ");
        botonCargar.setFont(new Font("Roboto Black", Font.PLAIN, 22));
        botonCargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonCargar.setOpaque(true);
        botonCargar.setForeground(Color.WHITE);
        botonCargar.setBackground(Color.GREEN);
        botonCargar.setBounds(40, 550, 250, 40);
        botonCargar.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(botonCargar);

        // Botón "VER LISTA DE EMPLEADOS"
        JButton botonLeer = new JButton("BUSCAR");
        botonLeer.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        botonLeer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonLeer.setOpaque(true);
        botonLeer.setForeground(Color.WHITE);
        botonLeer.setBackground(Color.BLUE);
        botonLeer.setBounds(377, 550, 238, 40);
        contentPane.add(botonLeer);
        
        textField = new JTextField("INGRESA EL NUMERO DE CEDULA.....");
        textField.setBounds(93, 109, 880, 33);
        textField.setForeground(new Color(0, 0, 0));
        textField.setOpaque(true);
        textField.setBackground(new Color(25, 34, 41));
        textField.setForeground(new Color(234, 226, 183));
        textField.setFont(new Font("Roboto", Font.PLAIN, 16));
        contentPane.add(textField);
        textField.setColumns(10);
/*
        // Agregar listeners para los botones (acción al hacer clic)
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para borrar todo
                // ...
            }
        });

        botonCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cargar empleado
                // ...
            }
        });

        botonLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para ver lista de empleados
                // ...
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MiVentana().setVisible(true);
        });
    }
        
        







        
        






        
*/
        // Ajustar el tamaño del JFrame automáticamente
        //pack();

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new lectura();
    }
}
