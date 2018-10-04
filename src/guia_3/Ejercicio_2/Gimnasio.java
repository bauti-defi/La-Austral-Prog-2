package guia_3.Ejercicio_2;

public class Gimnasio{

    public String gym_nombre;
    public static int num_empleados, num_socios;


    public Gimnasio() {
    }

    public Gimnasio(String gym_nombre, int num_empleados, int num_socios){
        this.gym_nombre = gym_nombre;
        this.num_socios = num_socios;
        this.num_empleados = num_empleados;
    }

    public int get_num_empleados(){
        return num_empleados;
    }

    public int get_num_socios(){
        return num_socios;
    }

    public String get_gym_nombre(){
        return gym_nombre;
    }


}
