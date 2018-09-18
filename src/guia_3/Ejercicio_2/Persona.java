package guia_3.Ejercicio_2;
import guia_3.Ejercicio_2.Personas.*;

public abstract class Persona extends Gimnasio {

    public int id;
    public String apellido;
    public String nombre;
    public String tipo_empleado;

    public static int total_personas = Socio.total_socios + Empleado.total_empleados;

    public abstract void setPersona(int id, String apellido, String nombre, String tipo_empleado);
    public abstract String getInfoPersona(int id);
}
