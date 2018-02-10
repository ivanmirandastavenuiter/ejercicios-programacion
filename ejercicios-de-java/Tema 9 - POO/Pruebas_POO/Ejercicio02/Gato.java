/*
 * Definición de la clase Gato.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class Gato extends Animal {
  
  String juguete;
  
  public Gato (Sexo s) {
    super(s);
    juguete = "Bola de lana";
  }
  
  public Gato (String a) {
    super(Sexo.HEMBRA);
    juguete = a;
  }
  
  @Override
  public void juega() {
    System.out.println("El gato está jugando en el jardín del chalet.");
  }
  
  @Override
  public String toString() {
    return super.toString() + "Juguete: " + this.juguete + "\n";
  }
}
