// Tarea jerarquía de clases - Herencia
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// SubClase Triangulo

public class Triangulo extends Figura implements Comparable<Triangulo>{
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

    public int compareTo(Triangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladActual = this.lados;
        double ladPorComparar = rectPorComparar.lados;

        
        if(miArea == areaPorComparar){
            if (ladActual == ladPorComparar){
                return 0;
            }
            else{
                return 2; // Es necesario poner la excepción a esa condicional
            } // En este caso si retorna 2 es porque tienen el mismo área pero la cantidad de lados es diferente
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}