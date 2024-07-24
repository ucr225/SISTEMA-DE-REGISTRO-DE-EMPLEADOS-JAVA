package Ventana;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton cargar,leer,instrucciones;
    private JLabel Saludo,saludo2; // Declaración de la etiqueta Saludo

    public VentanaPrincipal() {
        setResizable(false);
        setTitle("SISTEMA DE GESTION DE EMPLEADOS");
        setBounds(100, 100, 1056, 680);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        // Creación de la etiqueta Saludo
        Saludo = new JLabel("BIENVENIDO ESTIMADO USUARIO ");
        Saludo.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        Saludo.setBounds(400,50, 317, 50);
        contentPane.add(Saludo); // Agrega la etiqueta al panel
        
        saludo2 = new JLabel("SISTEMA DE GESTION DE EMPLEADOS");
        saludo2.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        saludo2.setBounds(380,75, 417, 50);
        contentPane.add(saludo2); // Agrega la etiqueta al panel
        
        //BOTONES
        cargar = new JButton("CARGAR EMPLEADO");
		//cargar.setForeground(Color.WHITE);
        cargar.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		cargar.setBorder(null);
		//cargar.setBackground(Color.WHITE);
		cargar.setBounds(150, 400, 182, 40);
		
		contentPane.add(cargar);
		
        leer = new JButton();
        leer.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        leer.setText("VER LISTA DE EMPLEADOS");
		//cargar.setForeground(Color.WHITE);
		leer.setBorder(null);
		//cargar.setBackground(Color.WHITE);
		leer.setBounds(729, 398, 238, 45);
		contentPane.add(leer);
		
        instrucciones = new JButton();
        instrucciones.setFont(new Font("Roboto Black", Font.PLAIN, 16));
        instrucciones.setText("INSTRUCCIONES DE USO.");
		//cargar.setForeground(Color.WHITE);
		instrucciones.setBorder(null);
		//cargar.setBackground(Color.WHITE);
		instrucciones.setBounds(400, 400, 250, 45);
		contentPane.add(instrucciones);
		
		
		
		  
        //
    }



    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
