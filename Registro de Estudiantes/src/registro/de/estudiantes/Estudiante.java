package registro.de.estudiantes;
        
    //Al comenzar primero se comenzara creando las diferentes variables
    //que se utilizaran en el proyecto.
        
public class Estudiante {
    private String Nombre;
    private String Apellido;
    private int año;

    //Con el metodo set y get se estara dando la informacion brindada
    //para ser mostrada en consola.
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

     //Generar una identificacion para el estudiante.
    
    

    
    

}
