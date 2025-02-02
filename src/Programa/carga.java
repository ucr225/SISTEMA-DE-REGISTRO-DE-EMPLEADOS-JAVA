package Programa;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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


public class carga extends JFrame {
    private JPanel contentPane;
    private JLabel etiquetaSaludo;

    public carga() {
    	
    	
    	//para mi record
    	//Empleado empleado;
    	//empleado = new Empleado(nombre, apellido, getDefaultCloseOperation(), getTitle(), getTitle(), getDefaultCloseOperation(), getTitle(), getDefaultCloseOperation());
    	//hoaaaa
        // Creando el content pane
        contentPane = new JPanel();
        setBounds(100, 100, 1056, 680);
        setTitle("CREATE EMPLOYEE");
        setResizable(false);
        contentPane.setBackground(new Color(25, 34, 41));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        setResizable(false);
        
        // Configurar la operación de cierre
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Cargar el ícono desde el archivo
        ImageIcon icon = new ImageIcon("icono.png");
        setIconImage(icon.getImage()); // Establecer el icono de la ventana
        //
        etiquetaSaludo = new JLabel("CREATING EMPLOYEE PHASE");
        etiquetaSaludo.setForeground(new Color(239, 243, 245));
        etiquetaSaludo.setOpaque(true);
        etiquetaSaludo.setBackground(new Color(25, 34, 41));
        etiquetaSaludo.setFont(new Font("Poppins", Font.BOLD, 30));
        etiquetaSaludo.setBounds(322, 33, 450, 50);
        etiquetaSaludo.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(etiquetaSaludo);
        
        
        // Etiqueta para el nombre
        JLabel labelNombre = new JLabel("NAME: ");
        labelNombre.setFont(new Font("Poppins", Font.BOLD, 20));
        labelNombre.setOpaque(true);
        labelNombre.setBackground(new Color(25, 34, 41));
        labelNombre.setForeground(new Color(234, 226, 183));
        labelNombre.setBounds(20, 98, 327, 49); // Ajustamos la posición vertical
        contentPane.add(labelNombre);

        // Campo de texto para el nombre
        JTextField textNombre = new JTextField("Press here to put your name");
        textNombre.setForeground(new Color(0, 0, 0));
        textNombre.setOpaque(true);
        textNombre.setBackground(new Color(25, 34, 41));
        textNombre.setForeground(new Color(234, 226, 183));
        textNombre.setFont(new Font("Poppins", Font.PLAIN, 16));
        textNombre.setBounds(20, 137, 349, 24);
        textNombre.setBorder(BorderFactory.createEmptyBorder());
        textNombre.setColumns(10);
        contentPane.add(textNombre);
        

        // Etiqueta para el apellido
        JLabel labelApellido = new JLabel("LAST NAME:");
        labelApellido.setFont(new Font("Poppins", Font.BOLD, 18));
        labelApellido.setBounds(20, 180, 317, 49);
        labelApellido.setOpaque(true);
        labelApellido.setBackground(new Color(25, 34, 41));
        labelApellido.setForeground(new Color(234, 226, 183));
        contentPane.add(labelApellido);
        
        // Separador para el nombre - apellido
        JSeparator separatorApellido = new JSeparator();
        separatorApellido.setForeground(new Color(160, 167, 172));
        separatorApellido.setBounds(20, 170, 338, 2);
        contentPane.add(separatorApellido);
        
     // Campo de texto para el apellido
        JTextField textApellido = new JTextField("Press here to put your last name");
        textApellido.setForeground(new Color(0, 0, 0));
        textApellido.setOpaque(true);
        textApellido.setBackground(new Color(25, 34, 41));
        textApellido.setForeground(new Color(234, 226, 183));
        textApellido.setFont(new Font("Poppins", Font.PLAIN, 16));
        textApellido.setBounds(20, 220, 317, 49);
        textApellido.setBorder(BorderFactory.createEmptyBorder());
        textApellido.setColumns(10);
        contentPane.add(textApellido);
        
        // Separador para el  apellido-cedula
        JSeparator separatorCedula = new JSeparator();
        separatorCedula.setForeground(new Color(160, 167, 172));
        separatorCedula.setBounds(20, 270, 338, 2);
        contentPane.add(separatorCedula);
        
     // Etiqueta para la cédula
        JLabel labelCedula = new JLabel("ID NUMBER");
        
        labelCedula.setFont(new Font("Poppins", Font.BOLD, 18));
        labelCedula.setBounds(20, 280, 317, 49);
        labelCedula.setOpaque(true);
        labelCedula.setBackground(new Color(25, 34, 41));
        labelCedula.setForeground(new Color(234, 226, 183));
        contentPane.add(labelCedula);

        
     // Campo de texto para la cédula
        JTextField textCedula = new JTextField("#1111");
        textCedula.setForeground(new Color(0, 0, 0));
        textCedula.setOpaque(true);
        textCedula.setBackground(new Color(25, 34, 41));
        textCedula.setForeground(new Color(234, 226, 183));
        textCedula.setFont(new Font("Poppins", Font.PLAIN, 16));
        textCedula.setBounds(20, 320, 495, 49);
        textCedula.setBorder(BorderFactory.createEmptyBorder());
        textCedula.setColumns(10);
        contentPane.add(textCedula);
        
        // Separador para el  cedula-Genero
        JSeparator separatorGenero = new JSeparator();
        separatorGenero.setForeground(new Color(160, 167, 172));
        separatorGenero.setBounds(20, 370, 338, 2);
        contentPane.add(separatorGenero);
        
     // Etiqueta para el género
        JLabel labelGenero = new JLabel("GENDER:");
        labelGenero.setFont(new Font("Poppins", Font.BOLD, 18));
        labelGenero.setBounds(20, 385, 317, 49);
        labelGenero.setOpaque(true);
        labelGenero.setBackground(new Color(25, 34, 41));
        labelGenero.setForeground(new Color(234, 226, 183));
        contentPane.add(labelGenero);
        
        //RADIO BUTTONS!
        JRadioButton rdbtnHombre = new JRadioButton("Male");
       
        rdbtnHombre.setFont(new Font("Poppins", Font.BOLD, 16));
        rdbtnHombre.setBounds(20, 440, 103, 21);
        rdbtnHombre.setOpaque(true);
        rdbtnHombre.setBackground(new Color(25, 34, 41));
        rdbtnHombre.setForeground(new Color(234, 226, 183));
        contentPane.add(rdbtnHombre);

        JRadioButton rdbtnMujer = new JRadioButton("Female");
      
        rdbtnMujer.setFont(new Font("Poppins", Font.BOLD, 16));
        rdbtnMujer.setBounds(20, 470, 103, 21);
        rdbtnMujer.setOpaque(true);
        rdbtnMujer.setBackground(new Color(25, 34, 41));
        rdbtnMujer.setForeground(new Color(234, 226, 183));
        contentPane.add(rdbtnMujer);

        JRadioButton rdbtnOtro = new JRadioButton("Other");
        rdbtnOtro.setFont(new Font("Poppins", Font.BOLD, 16));
        rdbtnOtro.setBounds(20, 500, 200, 21);
        rdbtnOtro.setOpaque(true);
        rdbtnOtro.setBackground(new Color(25, 34, 41));
        rdbtnOtro.setForeground(new Color(234, 226, 183));
        contentPane.add(rdbtnOtro);

        // Para que solo un botón sea seleccionable
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnHombre);
        group.add(rdbtnMujer);
        group.add(rdbtnOtro);
        
     // Etiqueta para el correo electrónico
        JLabel labelCorreo = new JLabel("EMAIL:");
        labelCorreo.setFont(new Font("Poppins", Font.BOLD, 18));
        labelCorreo.setBounds(602, 99, 441, 49);
        labelCorreo.setBackground(new Color(25, 34, 41));
        labelCorreo.setForeground(new Color(234, 226, 183));
        contentPane.add(labelCorreo);

        // Campo de texto para el correo electrónico
        JTextField txtCorreo = new JTextField("example123@gmail.com");
        txtCorreo.setForeground(Color.BLACK);
        txtCorreo.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtCorreo.setColumns(10);
        txtCorreo.setBorder(BorderFactory.createEmptyBorder());
        txtCorreo.setBounds(602, 138, 349, 24);
        txtCorreo.setBackground(new Color(25, 34, 41));
        txtCorreo.setForeground(new Color(234, 226, 183));
        contentPane.add(txtCorreo);

        // Separador para el correo electrónico
        JSeparator separatorCorreo = new JSeparator();
        separatorCorreo.setForeground(Color.BLACK);
        separatorCorreo.setBounds(602, 170, 393, 2);
        contentPane.add(separatorCorreo);
                
        // Etiqueta para el número de teléfono
        JLabel labelTelefono = new JLabel("PHONE NUMBER :");
        labelTelefono.setFont(new Font("Poppins", Font.BOLD, 18));
        labelTelefono.setBounds(602, 190, 441, 49);
        labelTelefono.setBackground(new Color(25, 34, 41));
        labelTelefono.setForeground(new Color(234, 226, 183));
        contentPane.add(labelTelefono);

        // Campo de texto para el número de teléfono
        JTextField txtTelefono = new JTextField("0212111");
        txtTelefono.setForeground(Color.BLACK);
        txtTelefono.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtTelefono.setColumns(10);
        txtTelefono.setBorder(BorderFactory.createEmptyBorder());
        txtTelefono.setBounds(602, 234, 349, 24);
        txtTelefono.setBackground(new Color(25, 34, 41));
        txtTelefono.setForeground(new Color(234, 226, 183));
        contentPane.add(txtTelefono);

        // Separador para el número de teléfono
        JSeparator separatorTelefono = new JSeparator();
        separatorTelefono.setForeground(Color.BLACK);
        separatorTelefono.setBounds(602, 267, 393, 2);
        contentPane.add(separatorTelefono);
                
        // Etiqueta para la dirección de habitación
        JLabel labelDireccion = new JLabel("ENTER YOUR HOME ADDRESS:");
        labelDireccion.setFont(new Font("Poppins", Font.BOLD, 18));
        labelDireccion.setBounds(602, 290, 441, 49);
        labelDireccion.setBackground(new Color(25, 34, 41));
        labelDireccion.setForeground(new Color(234, 226, 183));
        contentPane.add(labelDireccion);

        // Campo de texto para la dirección de habitación
        JTextField txtDireccion = new JTextField("ADDRESS");
        txtDireccion.setForeground(Color.BLACK);
        txtDireccion.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtDireccion.setColumns(10);
        txtDireccion.setBorder(BorderFactory.createEmptyBorder());
        txtDireccion.setBounds(602, 334, 349, 24);
        txtDireccion.setBackground(new Color(25, 34, 41));
        txtDireccion.setForeground(new Color(234, 226, 183));
        contentPane.add(txtDireccion);

        // Separador para la dirección de habitación
        JSeparator separatorDireccion = new JSeparator();
        separatorDireccion.setForeground(Color.BLACK);
        separatorDireccion.setBounds(602, 367, 393, 2);
        contentPane.add(separatorDireccion);
                
        // Etiqueta para la edad
        JLabel labelEdad = new JLabel("SELECT YOUR AGE:");
        labelEdad.setFont(new Font("Poppins", Font.BOLD, 18));
        labelEdad.setBounds(602, 390, 441, 49);
        labelEdad.setBackground(new Color(25, 34, 41));
        labelEdad.setForeground(new Color(234, 226, 183));
        contentPane.add(labelEdad);

        
        
     // Combo box para la edad
        JComboBox comboEdad = new JComboBox();
        comboEdad.setFont(new Font("Roboto Black", Font.PLAIN, 18));
        comboEdad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comboEdad.setBounds(602, 434, 170, 33);
        comboEdad.setBackground(new Color(25, 34, 41));
        comboEdad.setBorder(BorderFactory.createLineBorder(new Color(234, 226, 183), 8));

        comboEdad.setForeground(new Color(234, 226, 183));
        for (int i = 1; i <= 100; i++) {
            comboEdad.addItem(i);
        }
        comboEdad.setBorder(new LineBorder(new Color(0, 0, 0)));
        comboEdad.setUI(new BasicComboBoxUI());
        contentPane.add(comboEdad);
        
        // Botón "BORRAR TODO"
        JButton botonBorrar = new JButton("CLEAN ALL");
        botonBorrar.setFont(new Font("Poppins", Font.BOLD, 22));
        botonBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonBorrar.setOpaque(true);
        botonBorrar.setForeground(Color.WHITE);
        botonBorrar.setBackground(Color.RED);
        botonBorrar.setBounds(745, 550, 250, 40);
        botonBorrar.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(botonBorrar);

        // Botón "CARGAR EMPLEADO"
        JButton botonCargar = new JButton("CREATE EMPLOYEE");
        botonCargar.setFont(new Font("Poppins", Font.BOLD, 20));
        botonCargar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonCargar.setOpaque(true);
        botonCargar.setForeground(Color.WHITE);
        botonCargar.setBackground(new Color(0x67, 0x94, 0x36));
        
        botonCargar.setBounds(40, 550, 250, 40);
        botonCargar.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(botonCargar);

        // Botón "VER LISTA DE EMPLEADOS"
        JButton botonLeer = new JButton("SEE LIST");
        botonLeer.setFont(new Font("Poppins", Font.BOLD, 20));
        botonLeer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonLeer.setOpaque(true);
        botonLeer.setForeground(Color.WHITE);
        botonLeer.setBackground(Color.BLUE);
        botonLeer.setBounds(377, 550, 238, 40);
        contentPane.add(botonLeer);
        
        
        // Agregar ActionListener al botón
        botonCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí manejas la acción del botón
            	
            	
                // Obtener el texto ingresado y realizar otras acciones
                String nombre = textNombre.getText();
                String apellido = textApellido.getText();
                int cedula = Integer.parseInt(textCedula.getText());
                String genero = "";
                
                if(rdbtnHombre.isSelected()) {
                	genero="Masculino";
                }else if (rdbtnMujer.isSelected()) {
                	genero="Femenino";
                }else if (rdbtnOtro.isSelected()) {
                	genero="Otro";
                }
                ///                                               
                String correo = txtCorreo.getText();
                //int numero = Integer.parseInt(txtTelefono.getText());
                String direccion = txtDireccion.getText();
                int edad = Integer.parseInt(comboEdad.getSelectedItem().toString());
                /*
                // Por ejemplo, imprimir los valores obtenidos
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("Cédula: " + cedula);
                System.out.println("Género: " + genero);
                System.out.println("Correo electrónico: " + correo);
                System.out.println("Número de teléfono: " + numero);
                System.out.println("Dirección: " + direccion);
                System.out.println("Edad: " + edad);
                */
                // Crear una instancia de Empleado
                Empleado empleado1 = new Empleado(nombre, apellido, cedula, genero,
                        correo,direccion, edad);

                // Imprimir la representación textual del objeto
                
                System.out.println(empleado1);
                System.out.println(empleado1.nombre);              
                System.out.println(empleado1.apellido);
                System.out.println(empleado1.cedula);
                System.out.println(empleado1.genero);
                System.out.println(empleado1.correo);
                System.out.println(empleado1.direccion);
                System.out.println(empleado1.edad);
                System.out.println("-------------------");
                
                Datos.registro(nombre, apellido, cedula, genero, correo,  direccion, edad);
                
                
                
            }


        });
        
        
        
        
        
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
        new carga();
    }
}
