// Tarea jerarquía de clases - Herencia
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// SubClase Circulo

public class Circulo extends Figura{
    private double diam;
    private double rad;
    private double perim;

    public Circulo(double di){
        diam = di;
        rad = diam / 2;
        lados = 0;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        area = (Math.PI) * (Math.pow(rad, 2));
        return area;
    }

    public double calcularPerimetro(){
        perim = 2 * (Math.PI) * rad;
        return perim;
    }

    public int cantidadLados(){
        return lados;
    }
}