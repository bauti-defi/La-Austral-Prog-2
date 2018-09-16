package guia_5.ejercicio_1;

import java.util.List;

public class Sarten extends Utensilio {

    public Sarten() {
    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {
            if(ingredientes.get(i).getTipo().equals("Rodajas") && ingredientes.get(i+1).getTipo().equals("Aceite") && ingredientes.get(i+2).getTipo().equals("Oregano")){
                return new Ingrediente("Bruschetta");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
