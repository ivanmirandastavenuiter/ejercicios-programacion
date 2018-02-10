/*
 * Definición de la subclase Canario.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda.
 */
public class Canario extends Ave {
  
  // Definición de atributos.
  
  String canto;
  String nombre;
  
  public Canario(boolean volador, String tipoAve, String canto) {
    super(volador, tipoAve);
    this.canto = canto;
  }

  public String getCanto() {
    return canto;
  }

  public void setCanto(String canto) {
    this.canto = canto;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }
  
  @Override
  public void vuela() {
    System.out.println("El canario está volando, pero muy poquito.");
  }
  
  public void canta() {
    switch (canto.toLowerCase()) {
      case "belga":
        System.out.println("El canario belga se caracteriza por ser criado en la "
          + "región belga de las Malinas.");
        break;
      case "american singer":
        System.out.println("El American Singer tiene un canto melodioso y fue criado"
          + "en los EEUU.");
        break;
      case "harzer roller":
        System.out.println("Su canto consta de 4 estrofas. Suele ser un canto suave,"
          + "sin estridencias.");
        break;
      case "timbrado español":
        System.out.println("Presenta un canto vital y lleno de energía.");
        break;
    }
  }
  
  public void amenazado(Gato Hambriento, boolean haComido) {
    if (!haComido) {
      System.out.println("El canario está aterrado porque el gato lo está mirando"
        + " con ojos sospechosamente amenazadores.");
    } else {
      System.out.println("Parece que " + Hambriento.getNombre() + " ya ha comido. El canario respira tranquilo.");
    }
  }
  
  @Override
  public String toString() {
    return super.toString() +
      "Categoría de canto: " + this.canto;
  } 
}