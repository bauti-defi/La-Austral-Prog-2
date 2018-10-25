package guia_5.ejercicio_1;

import java.util.List;

public abstract class Electrodomestico implements ElementoDeCocina {

    public Electrodomestico(){

    }

    @Override
    public abstract Ingrediente preparar(List<Ingrediente> ingredientes);
}
