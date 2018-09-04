package guia_3.Ejercicio_2.Personas.Empleados;

import guia_3.Ejercicio_2.Personas.Empleado;

public class Administrador extends Empleado {

    int administrador_id;
    String apellido_administrador, nombre_administrador;

    public void set_tipo_empleado(){
        tipo_empleado = this.getClass().getSimpleName();
    }

    public String get_tipo_empleado(){
        return tipo_empleado;
    }

    @Override
    public void setPersona(int id, String apellido, String nombre, String tipo_empleado) {
        super.setPersona(administrador_id, apellido_administrador, nombre_administrador, get_tipo_empleado());
    }
}
