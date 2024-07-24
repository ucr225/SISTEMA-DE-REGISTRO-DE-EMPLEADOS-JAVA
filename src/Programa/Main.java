package Programa;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton botonCargar, botonLeer, botonInstrucciones;
    private JLabel etiquetaSaludo, etiquetaTitulo;

    public Main() {
        // Crear el contentPane primero
        contentPane = new JPanel();
        setBounds(0, 0, 1080, 710);
		setResizable(false); //para que el tamano no se cambie

        //contentPane.setBackground(Color.WHITE);
        //contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPane.setLayout(null);
        setContentPane(contentPane); // Establecer el contentPane

        // Cargar la imagen de fondo
        ImageIcon fondoIcon = new ImageIcon("patron.png");

        JLabel fondoLabel = new JLabel(fondoIcon);
        fondoLabel.setBounds(0,0,  1080, 710);
        contentPane.add(fondoLabel); // Agregar la imagen de fondo al contentPane
        
        
        
        // Etiquetas
        etiquetaSaludo = new JLabel("BIENVENIDO ESTIMADO USUARIO \n SISTEMA DE GESTION DE EMPLEADOS");
        etiquetaSaludo.setForeground(new Color(3, 4, 94));
        etiquetaSaludo.setOpaque(true);
        etiquetaSaludo.setBackground(new Color(253, 252, 220));
        etiquetaSaludo.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        etiquetaSaludo.setBounds(200, 50, 700, 50);
        etiquetaSaludo.setHorizontalAlignment(JLabel.CENTER);
        fondoLabel.add(etiquetaSaludo);

        // Botones
        botonCargar = new JButton("CARGAR EMPLEADO");
        botonCargar.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        botonCargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonCargar.setOpaque(true);
        botonCargar.setForeground(new Color(3, 4, 94));
        botonCargar.setBackground(new Color(253, 252, 220));
        botonCargar.setBounds(100, 400, 250, 40);       
        botonCargar.setHorizontalAlignment(JLabel.CENTER);
        fondoLabel.add(botonCargar);

        botonLeer = new JButton("VER LISTA DE EMPLEADOS");
        botonLeer.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        botonLeer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
        botonLeer.setOpaque(true);
        botonLeer.setForeground(new Color(3, 4, 94));        
        botonLeer.setBackground(new Color(253, 252, 220));
        botonLeer.setBounds(729, 398, 238, 45);
        fondoLabel.add(botonLeer);

        botonInstrucciones = new JButton("INSTRUCCIONES DE USO");
        botonInstrucciones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonInstrucciones.setOpaque(true);
        botonInstrucciones.setForeground(new Color(3, 4, 94));
        botonInstrucciones.setBackground(new Color(253, 252, 220));
        botonInstrucciones.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        botonInstrucciones.setBounds(400, 400, 250, 45);
        fondoLabel.add(botonInstrucciones);
        
        

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Implementar acciones para los botones
    }
}





