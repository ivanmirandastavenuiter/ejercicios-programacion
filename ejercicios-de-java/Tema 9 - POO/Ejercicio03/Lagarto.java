/*
 * Definición de la subclase Lagarto.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda.
 */
public class Lagarto extends Animal {
  
  // Definición de atributos.
  
  String especie;
  int longitudCola;
  String medio;
  String nombre;
  
  public Lagarto (String nombre, String medio) {
    super();
    this.nombre = nombre;
    this.medio = medio;
  }
  
  public Lagarto (int longitud, String medio) {
    this.longitudCola = longitud;
    this.medio = medio;
    super.sexo = "macho";
  }

  public String getEspecie() {
    return especie;
  }

  public int getLongitudCola() {
    return longitudCola;
  }

  public String getMedio() {
    return medio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setLongitudCola(int longitud) {
    this.longitudCola = longitud;
  }

  public void setMedio(String medio) {
    this.medio = medio;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public void sacaLengua() {
    System.out.println("El lagarto saca la lengua de forma intermitente y muy a menudo.");
  }
  
  public void peleaCon(Lagarto enemigo) {
    
    int vitalidadOriginal = 100;
    int vitalidadEnemigo = 100;
    int ataqueOriginal;
    int ataqueEnemigo;
    
    do {
      ataqueOriginal = (int)(Math.random() * 21);
      ataqueEnemigo = (int)(Math.random() * 21);
      vitalidadOriginal -= ataqueEnemigo;
      vitalidadEnemigo -= ataqueOriginal;
      System.out.println(this.getNombre() + " ataca contra " + enemigo.getNombre() + " causando " + ataqueOriginal + " de daño");
      System.out.println(enemigo.getNombre() + " ataca contra " + this.getNombre() + " causando " + ataqueEnemigo + " de daño");
      System.out.println("Vitalidad restante de " + this.getNombre() + ": " + vitalidadOriginal);
      System.out.println("Vitalidad restante de " + enemigo.getNombre() + ": " + vitalidadEnemigo);
      System.out.println();
    } while (vitalidadOriginal > 0 && vitalidadEnemigo > 0);
    
    if (vitalidadOriginal <= 0 && vitalidadEnemigo > 0) {
      System.out.println(enemigo.getNombre() + " ha resultado vencedor.");
    } else if (vitalidadOriginal > 0 && vitalidadEnemigo <= 0) {
      System.out.println(this.getNombre() + " ha resultado vencedor.");
    } else if (vitalidadOriginal <= 0 && vitalidadEnemigo <= 0) {
      System.out.println("Parece que la pelea ha terminado en empate.");
    }
  }

  @Override
  public String toString() {
    return super.toString() +
      "Especie: " + this.especie + "\n" +
      "Longitud de la cola: " + this.longitudCola + "\n" +
      "Medio natural: " + this.medio + "\n" +
      "Nombre: " + this.nombre + "\n";
  }
}
