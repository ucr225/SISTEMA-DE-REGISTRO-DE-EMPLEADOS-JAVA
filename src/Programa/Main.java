package Programa;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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
        setBounds(0, 0, 900, 780);
		setResizable(false); //para que el tamano no se cambie

        //contentPane.setBackground(Color.WHITE);
        //contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPane.setLayout(null);
        setContentPane(contentPane); // Establecer el contentPane

        // Cargar la imagen de fondo
        ImageIcon fondoIcon = new ImageIcon("patron.jpg");

        JLabel fondoLabel = new JLabel(fondoIcon);
        fondoLabel.setBounds(0,0,  900, 780);
        contentPane.add(fondoLabel); // Agregar la imagen de fondo al contentPane
        
        
        
        // Etiquetas
        etiquetaSaludo = new JLabel("BIENVENIDO ESTIMADO USUARIO");
        etiquetaSaludo.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        etiquetaSaludo.setBounds(400, 50, 317, 50);
        fondoLabel.add(etiquetaSaludo);

        etiquetaTitulo = new JLabel("SISTEMA DE GESTION DE EMPLEADOS");
        etiquetaTitulo.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        etiquetaTitulo.setBounds(380, 75, 417, 50);
        fondoLabel.add(etiquetaTitulo);

        // Botones
        botonCargar = new JButton("CARGAR EMPLEADO");
        botonCargar.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        botonCargar.setBounds(150, 400, 182, 40);
        fondoLabel.add(botonCargar);

        botonLeer = new JButton("VER LISTA DE EMPLEADOS");
        botonLeer.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        botonLeer.setBounds(729, 398, 238, 45);
        fondoLabel.add(botonLeer);

        botonInstrucciones = new JButton("INSTRUCCIONES DE USO");
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





