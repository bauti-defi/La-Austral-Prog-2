package guia_5.ejercicio_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CocinaTest {
    @Test
    public void test001_MezcladorShouldMakeMasa(){
        ElementoDeCocina mezclador = new Mezclador();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Harina"));
        ingredientes.add(new Ingrediente("Agua"));
        assertEquals("Masa", mezclador.preparar(ingredientes).getTipo());
    }

    @Test
    public void test002_HornoElectricoShouldMakePan(){
        ElementoDeCocina hornoelectrico = new HornoElectrico();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Masa"));
        assertEquals("Pan", hornoelectrico.preparar(ingredientes).getTipo());
    }

    @Test
    public void test003_HornoDeBarroShouldMakePan(){
        ElementoDeCocina hornodebarro = new HornoDeBarro();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Masa"));
        assertEquals("Pan", hornodebarro.preparar(ingredientes).getTipo());
    }

    @Test
    public void test004_SartenShouldMakeBruschetta(){
        ElementoDeCocina sarten = new Sarten();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Rodajas"));
        ingredientes.add(new Ingrediente("Aceite"));
        ingredientes.add(new Ingrediente("Oregano"));
        assertEquals("Bruschetta", sarten.preparar(ingredientes).getTipo());
    }

    @Test
    public void test004_CuchilloShouldMakeRodajas(){
        ElementoDeCocina cuchillo = new Cuchillo();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Pan"));
        assertEquals("Rodajas", cuchillo.preparar(ingredientes).getTipo());
    }

    @Test
    public void test004_CuchilloShouldMakeRodajasIfIngredientesContainPanAndOthers(){
        ElementoDeCocina cuchillo = new Cuchillo();
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Pan"));
        ingredientes.add(new Ingrediente("Otro"));
        assertEquals("Rodajas", cuchillo.preparar(ingredientes).getTipo());
    }
}