/*
 * Definición de la clase Caballo.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class Caballo extends Animal {
  
  String establo;
  
  public Caballo(String e) {
    super(Sexo.MACHO);
    establo = e;
  }
  
  public Caballo (Sexo s, String e) {
    super(s);
    establo = e;
  }
  
  public void relincha() {
    System.out.println("brhiiiiiiiihaaa!!");
  }
  
  @Override
  public void bebe() {
    System.out.println("El caballo bebe del pesebre");
  }
}
