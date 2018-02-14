/*
 * Definición de la subclase bicicleta.
 */
package ejercicio08;

/**
 *
 * @author Iván Miranda
 */
public class Bicicleta extends Vehiculo {
  
  int kilometrosRecorridos;
  int platos;
  int pinones;
  String materialCuadro;
  int velocidad;
  String marca;
  String modelo;

  public Bicicleta(String marca, String modelo) {
    super();
    this.marca = marca;
    this.modelo = modelo;
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public int getPlatos() {
    return platos;
  }

  public int getPinones() {
    return pinones;
  }

  public String getMaterialCuadro() {
    return materialCuadro;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  public void setPlatos(int platos) {
    this.platos = platos;
  }

  public void setPinones(int pinones) {
    this.pinones = pinones;
  }

  public void setMaterialCuadro(String materialCuadro) {
    this.materialCuadro = materialCuadro;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }
  
  public String pinta(int posicion) {
    String resultado = "";
    for (int a = 0; a < posicion; a++) {
      resultado += "    ";
    }
    resultado += "   __@   \n";
    for (int b = 0; b < posicion; b++) {
      resultado += "    ";
    }
    resultado += " _`\\<,_ \n";
    for (int c = 0; c < posicion; c++) {
      resultado += "    ";
    }
    resultado += "(*)/ (*) ";
    return resultado;
  } 
  
  public String pintaCaballito(int posicion) {
    String resultado = "";
    for (int a = 0; a < posicion; a++) {
      resultado += "    ";
    }
    resultado += " ~~O\n";
    for (int b = 0; b < posicion; b++) {
      resultado += "    ";
    }
    resultado += "  /\\,\n";
    for (int c = 0; c < posicion; c++) {
      resultado += "    ";
    }
    resultado += " -|~(*)\n";
    for (int d = 0; d < posicion; d++) {
      resultado += "    ";
    }
    resultado += "(*)\n";
    return resultado;
  } 
}
