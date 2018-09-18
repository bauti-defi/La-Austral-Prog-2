package guia_5.ejercicio_2;

public class CompoundFunction implements Funcion{

    private Funcion funcionMacro, funcionMicro;
    private double valor;

    public CompoundFunction(Funcion funcionMaco, Funcion funcionMicro){
        this.funcionMacro = funcionMaco;
        this.funcionMicro = funcionMicro;
    }

    @Override
    public double evaluate(double value) {
        return funcionMacro.evaluate(funcionMicro.evaluate(valor));
    }
}
