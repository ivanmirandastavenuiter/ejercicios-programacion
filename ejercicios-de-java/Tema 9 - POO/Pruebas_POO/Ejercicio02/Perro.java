/*
 * Definición de la clase Perro.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class Perro extends Animal {
  
  public Perro (Sexo s, int p) {
    super(s);
    peso = p;
  }
  
  public void ladra() {
    System.out.println("guau guau!");
  }
  
  @Override
  public String toString() {
    return super.toString() + "Peso: " + this.peso + "\n";
  }
  
  // Se usa override para modificar un método de la superclase Animal.
  
  @Override 
  public void bebe() {
    System.out.println("glup flup guau");
  }
}
