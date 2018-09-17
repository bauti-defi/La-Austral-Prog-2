package guia_5.ejercicio_1;

import java.util.List;

public class Paso{
    private List<Ingrediente> ingredientes;
    private ElementoDeCocina elementoDeCocina;

    public Paso(List<Ingrediente> ingredientes,ElementoDeCocina elementoDeCocina) {
        this.elementoDeCocina = elementoDeCocina;
        this.ingredientes = ingredientes;
    }
}
