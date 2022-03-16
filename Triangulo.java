// Tarea jerarquía de clases - Herencia
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// SubClase Triangulo

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
        lados = 3;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        area = (base * altura) / 2;
        return area;
    }

    public int cantidadLados(){
        return lados;
    }
}