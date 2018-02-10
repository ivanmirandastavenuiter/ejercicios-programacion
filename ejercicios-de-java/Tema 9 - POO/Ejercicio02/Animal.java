/*
 * Definición de la superclase Animal.
 */
package ejercicio02;

/**
 *
 * @author Iván Miranda.
 */
public abstract class Animal {
  
  // Declaración de atributos 
  
  private int altura;
  private int peso;
  String sexo;
  String color;
  
  public Animal() {
    this.sexo = "macho";
  }
  
  public Animal(String sexo) {
    this.sexo = sexo;
  }
  
  public Animal(String sexo, int peso) {
    this.sexo = sexo;
    this.peso = peso;
  }
  
  public Animal(int altura, int peso) {
    this.altura = altura;
    this.peso = peso;
  }

  public int getAltura() {
    return altura;
  }

  public int getPeso() {
    return peso;
  }

  public String getSexo() {
    return sexo;
  }

  public String getColor() {
    return color;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  public void come() {
    System.out.println("Ñamñamfdjfhjd");
  }
  
  public void bebe() {
    System.out.println("glupglup");
  }

  @Override
  public String toString() {
    return "Características principales del animal:\n"
      + "*****************************************\n"
      + "Altura: " + this.altura + "\n"
      + "Peso: " + this.peso + "\n"
      + "Sexo: " + this.sexo + "\n"
      + "Color: " + this.color + "\n";
  }
}
