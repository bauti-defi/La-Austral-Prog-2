package guia_5.ejercicio_2;

public class QuadraticFunction implements Funcion {

    private double x_2, x_1, x_0;

    public QuadraticFunction(double x_2, double x_1, double x_0){
        this.x_0 = x_0;
        this.x_1 = x_1;
        this.x_2 = x_2;
    }

    @Override
    public double evaluate(double value) {
        return (x_2*Math.pow(value,2) + x_1*value + x_0);
    }
}
