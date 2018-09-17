package guia_5.ejercicio_1;

import java.util.List;

public interface ElementoDeCocina {
    Ingrediente preparar(List<Ingrediente> ingredientes);

    default boolean contains(String ingredienteName, List<Ingrediente> ingredientes){
        for (Ingrediente ingrediente : ingredientes) {
            if(ingrediente.getTipo().equals(ingredienteName)){
                return true;
            }
        }
        return false;
    }
}
