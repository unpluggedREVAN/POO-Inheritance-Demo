// Tarea jerarquía de clases - Herencia
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// Super Clase Figura

//figura es abstract porque tiene al menos un m t o d o abstracto
public abstract class Figura {
    int lados; // Todos. El círculo guarda un 0
    double area;

    public Figura (){ // Constructor
        lados = 0;
        area = 0;
    }

    public abstract double calcularArea();
    public abstract int cantidadLados();
}