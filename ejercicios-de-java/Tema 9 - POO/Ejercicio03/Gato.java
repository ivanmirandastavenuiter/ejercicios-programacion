/*
 * Definición de la subclase Gato.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda
 */
public class Gato extends Mamifero {
  
  // Definición de atributos.
  
  String raza;
  String nombre;
  
  public Gato() {
    super();
  }
  
  public Gato (int altura, int peso, String especie, String raza) {
    super(altura, peso, especie);
    this.raza = raza;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  @Override
  public String toString() {
    return super.toString() +
     "Raza del gato: " + this.raza;
  }
  
  @Override
  public void come() {
    System.out.println("El gato está comiendo del cazo.");
  }
  
  @Override
  public void bebe() {
    System.out.println("El gato está bebiendo agua.");
  }
  
  public void maulla() {
    System.out.println("miaaaauuuuu muaaaaaa.");
  }
  
  public Gato haParido() {
    Gato cria = new Gato();
    return cria;
  }
  
  public int llamaRefuerzos() {
    return (int)(Math.random() * 5 + 1);
  }
  
  public void grita() {
    System.out.println("jggggggggggghhhhhhh!!");
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }
}
