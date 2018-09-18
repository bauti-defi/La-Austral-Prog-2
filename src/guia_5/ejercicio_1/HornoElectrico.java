package guia_5.ejercicio_1;

import java.util.List;

public class HornoElectrico extends Electrodomestico {

    public HornoElectrico() {
    }

    @Override
    public Ingrediente preparar(List<Ingrediente> ingredientes) {
        for (int i = 0; i < ingredientes.size(); i++) {

            if(contains("Masa", ingredientes)){
            if(ingredientes.get(i).getTipo().equals("Masa")){

                System.out.println("Cocinando por 5 minutos");
                return new Ingrediente("Pan");
            }
        }
        throw new RuntimeException("Ingredientes invalidos");
    }
}
