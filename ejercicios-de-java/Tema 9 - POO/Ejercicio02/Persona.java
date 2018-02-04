/*
 * Definición de la clase Persona.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class Persona {
  
  // Definición de los atributos de Persona.
  
  private String oficio;
  
  int edad;
  int numeroDeHijos;
  String colorPelo;
  String direccion;
  
  public Persona (String o) {
    oficio = o;
  }
  
  public String getOficio() {
    return this.oficio;
  }
  
  public void setOficio(String o) {
    this.oficio = o;
  }
  
  public void trabaja() {
    System.out.println("se levanta a las 6 para trabajar");
  }
  
  public void conduce() {
    System.out.println("13 km para volver a casa todos los días.");
  }
  public String toString() {
    return "Oficio: " + this.oficio + "\n";
  }
}
