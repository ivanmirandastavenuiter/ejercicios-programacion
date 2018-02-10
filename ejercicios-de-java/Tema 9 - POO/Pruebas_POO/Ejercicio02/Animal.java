/*
 * Definición de la superclase Animal.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public abstract class Animal {
  
  private Sexo sexo;
  
  int peso;
  int edad;
  String color;
  
  // Constructor que introduce el sexo del animal.
  
  public Animal(Sexo s) {
    this.sexo = s;
  }
  
  // Get para extraer el sexo del animal.
  
  public Sexo getSexo() {
    return this.sexo;
  }
  
  // Set para establecer el sexo del animal.
  
  public void setSexo(Sexo s) {
    this.sexo = s;
  }
  
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }
  
  // Métodos de instancia comunes a la clase Animal.
  
  public void juega() {
    System.out.println("Juega con la pelota.");
  }
  
  public void bebe() {
    System.out.println("glup glup");
  }
}
