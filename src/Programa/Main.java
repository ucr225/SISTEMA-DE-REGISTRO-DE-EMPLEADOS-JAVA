package Programa;

import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.LinearGradientPaint;

public class Main extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton botonCargar, botonLeer, botonInstrucciones;
    private JLabel etiquetaSaludo;

    public Main() {
        // Crear el contentPane primero
        contentPane = new JPanel();
        setBounds(0, 0, 900, 410);
        setResizable(false); // Para que el tamaño no se cambie
        setTitle("MAIN PAGE");
        contentPane.setLayout(null);
        contentPane.setBackground(new Color(25, 72, 95)); // Establecer el color de fondo
        setContentPane(contentPane); // Establecer el contentPane
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Cargar el ícono desde el archivo
        ImageIcon icon = new ImageIcon("icono.png");
        setIconImage(icon.getImage()); // Establecer el icono de la ventana

        // Etiquetas
        etiquetaSaludo = new JLabel("EMPLOYEE MANAGEMENT");
        etiquetaSaludo.setForeground(new Color(217, 224, 164)); // Establecer el color de la fuente

        etiquetaSaludo.setOpaque(true);
        etiquetaSaludo.setOpaque(false);
        //etiquetaSaludo.setBackground(new Color(253, 252, 220));
        etiquetaSaludo.setFont(new Font("Poppins", Font.BOLD, 48));
        etiquetaSaludo.setBounds(100, 50, 700, 50);
        
        etiquetaSaludo.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(etiquetaSaludo); // Añadir la etiqueta al contentPane

        // Botones
        botonCargar = new JButton("CREATE EMPLOYEE");
        botonCargar.setFont(new Font("Poppins", Font.BOLD, 20));
        botonCargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonCargar.setOpaque(true);
        botonCargar.setForeground(new Color(25, 72, 95));
        botonCargar.setBackground(new Color(217, 224, 164));
        botonCargar.setBounds(30, 225, 240, 40);
        botonCargar.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(botonCargar); // Añadir el botón al contentPane

        botonInstrucciones = new JButton("INSTRUCTIONS");
        botonInstrucciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonInstrucciones.setOpaque(true);
        botonInstrucciones.setForeground(new Color(25, 72, 95));
        botonInstrucciones.setBackground(new Color(217, 224, 164));
        botonInstrucciones.setFont(new Font("Poppins", Font.BOLD, 20));
        botonInstrucciones.setBounds(320, 220, 250, 45);
        contentPane.add(botonInstrucciones); // Añadir el botón al contentPane
        
        
        botonLeer = new JButton("SEE LIST");
        botonLeer.setFont(new Font("Poppins", Font.BOLD, 24));
        botonLeer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonLeer.setOpaque(true);
        botonLeer.setForeground(new Color(25, 72, 95));
        botonLeer.setBackground(new Color(217, 224, 164));
        botonLeer.setBounds(619, 220, 238, 45);
        contentPane.add(botonLeer); // Añadir el botón al contentPane



        // Añadir ActionListener a los botones
        botonCargar.addActionListener(this);
        botonLeer.addActionListener(this);
        botonInstrucciones.addActionListener(this);

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    /*
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCargar) {
            new CargarEmpleadoWindow().setVisible(true);
        } else if (e.getSource() == botonLeer) {
            new VerListaEmpleadosWindow().setVisible(true);
        } else if (e.getSource() == botonInstrucciones) {
            new InstruccionesUsoWindow().setVisible(true);
        }
    }
    */
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCargar) {
            JOptionPane.showMessageDialog(this, "Cargar Empleado");
        } else if (e.getSource() == botonLeer) {
            JOptionPane.showMessageDialog(this, "Ver Lista de Empleados");
        } else if (e.getSource() == botonInstrucciones) {
            JOptionPane.showMessageDialog(this, "Instrucciones de Uso");
        }
    }
    
}
