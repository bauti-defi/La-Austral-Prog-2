package guia_5.ejercicio_1;

import java.util.List;

public interface RecetaDeCocina {
    List<Paso> getPasos();
    void addPaso(List<Ingrediente> ingredientes, ElementoDeCocina elementoDeCocina);

}
