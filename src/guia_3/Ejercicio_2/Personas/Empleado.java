package guia_3.Ejercicio_2.Personas;

import guia_3.Ejercicio_2.Persona;

public abstract class Empleado extends Persona {

    public int empleado_id;
    public String nombre, apellido;
    public String tipo_empleado;
    public static int total_socios;

    public static int total_empleados;

    @Override
    public void setPersona(int id, String apellido, String nombre, String tipo_empleado){
        this.id = empleado_id;
        this.apellido = apellido;
        this.nombre = nombre;
        total_empleados++;
    }

    @Override
    public String getInfoPersona(int id) {
        this.id = empleado_id;
        String info_empleado = apellido + ", " + nombre;
        return info_empleado;
    }

    public abstract void set_tipo_empleado();
    public abstract String get_tipo_empleado();

}
