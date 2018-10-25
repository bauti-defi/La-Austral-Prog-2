package guia_5.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Receta implements RecetaDeCocina{
    private List<Paso> pasos;

    public Receta() {
        pasos = new ArrayList<>();
    }

    @Override
    public List<Paso> getPasos() {
        return pasos;
    }

    @Override
    public void addPaso(List<Ingrediente> ingredientes, ElementoDeCocina elementoDeCocina) {
        pasos.add(new Paso(ingredientes, elementoDeCocina));
    }
}
