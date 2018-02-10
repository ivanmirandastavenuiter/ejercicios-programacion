/*
 * Definición de la subclase Mamífero.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda
 */
public abstract class Mamifero extends Animal {
  
  // Definición de atributos.
  
  String especie;
  String continente;
  String habitat;
  
  public Mamifero() {
    super();
  }

  public Mamifero(int altura, int peso, String especie) {
    super(altura, peso);
    this.especie = especie;
  }
  
  public Mamifero(String sexo, int peso, String habitat) {
    super(sexo, peso);
    this.habitat = habitat;
  }

  public String getEspecie() {
    return especie;
  }

  public String getContinente() {
    return continente;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setContinente(String continente) {
    this.continente = continente;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }
  
  public void amamanta() {
    System.out.println("La mamá amamanta a las crías.");
  }

  @Override
  public String toString() {
    return super.toString() + 
      "Especie: " + this.especie + "\n" +
      "Continente: " + this.continente + "\n" +
      "Hábitat: " + this.habitat + "\n";
  }
}
  
  

 
