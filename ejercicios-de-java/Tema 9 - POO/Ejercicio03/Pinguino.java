/*
 * Definición de la subclase Pingüino.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda
 */
public class Pinguino extends Ave {
  
  // Definición de atributos.
  
  int velocidadBuceo;
  String localizacion;
  String nombre;
  
  public Pinguino(boolean volador, String tipoAve) {
    super(volador, tipoAve);
    this.velocidadBuceo = 10;
  }
  
  public Pinguino(boolean volador, String tipoAve, int velocidad, String lugar) {
    super(volador, tipoAve);
    this.velocidadBuceo = velocidad;
    this.localizacion = lugar;
  }

  public int getVelocidadBuceo() {
    return velocidadBuceo;
  }

  public String getLocalizacion() {
    return localizacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setVelocidadBuceo(int velocidadBuceo) {
    this.velocidadBuceo = velocidadBuceo;
  }

  public void setLocalizacion(String localizacion) {
    this.localizacion = localizacion;
  }
  
  @Override
  public void vuela() {
    System.out.println("Los pingüinos perdieron hace miles de años la capacidad de volar.");
  }
  
  public int pesca() {
    int pecesCazados = 0;
    if (velocidadBuceo >= 0 && velocidadBuceo <= 10) {
      pecesCazados = (int)(Math.random() * 6);
    } else if (velocidadBuceo >= 11 && velocidadBuceo <= 20) {
      pecesCazados = (int)(Math.random() * 11);
    } else if (velocidadBuceo >= 21 && velocidadBuceo <= 31) {
      pecesCazados = (int)(Math.random() * 16);
    }
    return pecesCazados;
  }
  
  @Override
  public void bebe() {
    System.out.println(this.getNombre() + " no necesita beber agua dulce porque tiene"
      + " una glándula que elimina la sal en cada incursión que hace en el agua.");
  }
  
  public void sacaPecho() {
    System.out.println(this.getNombre() + " saca pecho y emite sonidos parecidos a rebuznos"
      + " cuando quiere aparearse.");
  }

  @Override
  public String toString() {
    return super.toString() + 
      "Velocidad media de buceo: " + this.velocidadBuceo + "\n" +
      "Localización frecuente: " + this.localizacion + "\n";
  }
}
