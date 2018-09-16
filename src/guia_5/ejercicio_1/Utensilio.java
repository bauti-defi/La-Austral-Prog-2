package guia_5.ejercicio_1;

import java.util.List;

public abstract class Utensilio implements ElementoDeCocina {

    public Utensilio(){

    }

    @Override
    public abstract Ingrediente preparar(List<Ingrediente> ingredientes);
}
