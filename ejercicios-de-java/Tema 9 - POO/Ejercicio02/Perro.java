/*
 * Definición de la subclase Perro.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda.
 */
public class Perro extends Mamifero {
  
  // Definición de atributos.
  
  String raza;
  
  public Perro(String raza) {
    super();
    this.raza = raza;
  }
  
  public Perro (int altura, int peso, String especie, String raza) {
    super(altura, peso, especie);
    this.raza = raza;
  }
  
  public void ladra() {
    System.out.println("guauu guauu!!");
  }
  
  public void persigue(Gato enemigo) {
    int refuerzos = enemigo.llamaRefuerzos();
    if (refuerzos >= 2) {
    enemigo.grita();
    System.out.println(enemigo.getNombre() + " ha llamado a unos colegas para defenderse"
      + " y juntos han podido librarse del " + this.getRaza() + ".");
    } else {
      System.out.println("Solo ha podido venir " + refuerzos + " colegón/es.");
      this.ladra();
      System.out.println(enemigo.getNombre() + " se asusta y consigue escabullirse.");
    }
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
      "Raza del perro: " + this.raza + "\n";
  }
}
