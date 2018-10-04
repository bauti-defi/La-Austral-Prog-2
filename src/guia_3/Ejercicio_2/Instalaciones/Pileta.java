package guia_3.Ejercicio_2.Instalaciones;
import guia_3.Ejercicio_2.Instalacion;

public class Pileta extends Instalacion {

    @Override
    public void setInstalacionName() {
        nombre_instalacion = (String) this.getClass().getSimpleName();
    }

    @Override
    public String getInstalacionName() {
        return nombre_instalacion;
    }

    public void crearClase(String nombre_clase, String nombre_instalacion, int prof_id, int sociosU){
        Clase clase_nueva = new Clase(nombre_clase, prof_id, sociosU);
    }
}
