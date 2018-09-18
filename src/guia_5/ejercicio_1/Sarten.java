package guia_5.ejercicio_1;

import java.util.List;

public class Sarten extends Utensilio {

    public Sarten() {
    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {
            if(contains("Rodajas", ingredientes) && contains("Aceite", ingredientes) && contains("Oregano", ingredientes)){
                return new Ingrediente("Bruschetta");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
