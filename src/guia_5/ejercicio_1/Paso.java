package guia_5.ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Paso implements RecetaDeCocina{
    private List<Ingrediente> ingredientes;
    private ElementoDeCocina elementoDeCocina;

    public Paso(ElementoDeCocina elementoDeCocina) {
        this.elementoDeCocina = elementoDeCocina;
        ingredientes = new ArrayList<>();
    }

    public void prepare(){
        elementoDeCocina.preparar(ingredientes);
    }


    @Override
    public Paso getPaso() {
        return this;
    }
}
