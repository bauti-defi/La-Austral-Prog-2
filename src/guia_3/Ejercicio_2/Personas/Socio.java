package guia_3.Ejercicio_2.Personas;

import guia_3.Ejercicio_2.Persona;

public class Socio extends Persona {

    private int socio_id;
    private String nombre, apellido;
    private String tipo_empleado = "Socio";

    public static int total_socios;

    @Override
    public void setPersona(int id, String apellido, String nombre, String tipo_empleado){
        this.id = socio_id;
        this.apellido = apellido;
        this.nombre = nombre;
        total_socios++;
    }

    @Override
    public String getInfoPersona(int id){
        String info_socio = apellido  + ", " + nombre;
        return info_socio;
    }




}
