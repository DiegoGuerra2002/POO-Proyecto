package registro.de.estudiantes;
public class RegistroDeEstudiantes {


    public static void main(String[] args) {
        Estudiante obj = new Estudiante();
//NY: solicitarle al usuario a introducir el nombre, apellido y año 
//que cursa el estudiante.        
        obj.setNombre("Diego");
        System.out.println("El nombre es: " + obj.getNombre());
        
        obj.setApellido("Guevara");
        System.out.println("el apellido del estudiante es: " + obj.getApellido());
        
        obj.setAño(4);
        System.out.println("El año de el estudiante es: " + obj.getAño());
        
 //Generar una identificacion para el estudiante.
 
    }
    
}
