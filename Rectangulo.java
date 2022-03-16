// Tarea jerarquía de clases - Herencia
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// SubClase Rectangulo

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
        lados = 4;
    }

    //implementacion del metodo abstracto
    public double calcularArea(){
        area = base * altura;
        return area;
    }

    public int cantidadLados(){
        return lados;
    }

    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar){
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
    
