package guia_5.ejercicio_1;

import java.util.List;

public class Cuchillo extends Utensilio{

    public Cuchillo() {
    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {
            if(ingredientes.get(i).getTipo().equals("Pan")){
                System.out.println("Cocinando por 5 minutos");
                return new Ingrediente("Rodajas");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
