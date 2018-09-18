package guia_5.ejercicio_2;

public class LinealFunction implements Funcion {

    private double x_1, x_0;

    public LinealFunction(double x_1, double x_0){
        this.x_0 = x_0;
        this.x_1 = x_1;
    }

    @Override
    public double evaluate(double value) {
        return (double)(x_1*value + x_0);
    }
}
