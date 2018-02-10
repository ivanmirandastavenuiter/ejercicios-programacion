/*
 * Instancias correspondientes al ejercicio 1.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class InstanciasPilotoDeFormula1 {
  public static void main(String[] args) {
    
    // Creación de las instancias.
    
    PilotoDeFormula1 antonioAlcantara = new PilotoDeFormula1();
    PilotoDeFormula1 carlitosAlcantara = new PilotoDeFormula1("Ferrari");
    
    // Uso de los getter.
    
    System.out.println("El equipo de Antonio Alcántara es " + 
      antonioAlcantara.getEquipo());
    System.out.println("El equipo de Carlitos Alcántara es " + 
      carlitosAlcantara.getEquipo());
    System.out.println();
    
    // Uso del setter.
    
    System.out.println("Pero Antonio está triste porque quiere correr con su hijo Carlitos ");
    System.out.println();
    
    antonioAlcantara.setEquipo("Ferrari");
    System.out.println("Ahora padre e hijo corren en " + antonioAlcantara.getEquipo());
    
  }
  
}
