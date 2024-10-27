package Programa;
public class Empleado {
    public String nombre;
    public String apellido;
    public int cedula;
    public String genero;
    public String correo;
    public String numeroTelefono;
    public String direccion;
    public int edad;
	public String numero;
	
	

    // Constructor
    public Empleado(String nombre, String apellido, int cedula, String genero,
                    String correo, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.genero = genero;
        this.correo = correo;
		//this.numero = numero2;
        //this.numeroTelefono = numero2;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    
    
    
/*
    // Getters y setters (puedes agregar más según tus necesidades)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ... (implementa los demás getters y setters)

    // Método toString para representación textual del objeto
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", genero='" + genero + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
*/
    
    
    // Ejemplo de uso
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", 12345678, "Masculino",
                "juan@example.com", "Calle Principal 123", 30);

        System.out.println(empleado1.nombre);
    }
    


}
