/*
 * Definición de la subclase coche.
 */
package ejercicio08;

/**
 *
 * @author Iván Miranda
 */
public class Coche extends Vehiculo {
  
  int kilometrosRecorridos;
  String marca;
  String modelo;
  int velocidad;
  
  public Coche(String marca, String modelo) {
    super();
    this.marca = marca;
    this.modelo = modelo;
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }
  
  public String pintaCoche(int posicion) {
    String resultado = "";
    for (int a = 0; a < posicion; a++) {
      resultado += "    ";
    }
    resultado += "       ______      \n";
    for (int b = 0; b < posicion; b++) {
      resultado += "    ";
    }
    resultado += "  /--'---:---`----|\n";
    for (int c = 0; c < posicion; c++) {
      resultado += "    ";
    }
    resultado += "  |==(o)-----(o)==J";
    return resultado;
  }
  
  public String pintaCocheQuemando(int posicion) {
    String resultado = "";
    for (int a = 0; a < posicion; a++) {
      resultado += "    ";
    }
    resultado += "SUP     --    ______      \n";
    for (int b = 0; b < posicion; b++) {
      resultado += "    ";
    }
    resultado += "YOU    ---/--'---:---`----|\n";
    for (int c = 0; c < posicion; c++) {
      resultado += "    ";
    }
    resultado += "NIGGEZ----|==(o)-----(o)==J";
    return resultado;
  }
}
