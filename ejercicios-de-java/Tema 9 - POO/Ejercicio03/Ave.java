/*
 * Definición de la subclase Ave.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda.
 */
public abstract class Ave extends Animal {
    
  // Definición de atributos.
  
  boolean volador;
  String tipoAve;
  
  public Ave(boolean volador, String tipoAve) {
    super();
    this.volador = volador;
    this.tipoAve = tipoAve;
  }
  
  public void vuela() {
    System.out.println("El ave está volando.");
  }
  
  public void haceNido(String dimension) {
    switch (dimension) {
      case "grande":
        System.out.println("El ave está haciendo un nido muy grande.");
        break;
      case "medio":
        System.out.println("El nido que está haciendo el ave es de tamaño normal.");
        break;
      case "pequeño":
        System.out.println("El nido que está haciendo es muy pequeño.");
        break;
    }
  }

  public boolean isVolador() {
    return volador;
  }

  public String getTipoAve() {
    return tipoAve;
  }

  public void setVolador(boolean volador) {
    this.volador = volador;
  }

  public void setTipoAve(String tipoAve) {
    this.tipoAve = tipoAve;
  }
  
  @Override
  public String toString() {
    return super.toString() 
      + "Volador: " + this.volador + "\n"
      + "Tipo de ave: " + this.tipoAve + "\n";
  }
}
