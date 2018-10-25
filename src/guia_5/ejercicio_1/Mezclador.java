package guia_5.ejercicio_1;

import java.util.List;

public class Mezclador extends Utensilio{

    public Mezclador() {

    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {
            if(contains("Harina", ingredientes) && contains("Agua", ingredientes)){
                return new Ingrediente("Masa");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
