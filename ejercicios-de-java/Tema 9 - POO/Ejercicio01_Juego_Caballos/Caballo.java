/*
 * Definición de la clase Caballo.
 */
package ejercicio01;

/**
 *
 * @author Iván Miranda
 */
public class Caballo {
  
  String nombre;
  double peso; // peso en Kg
  int altura; // altura en cm
  String color;
  int velocidad = 0;
  String raza;
  String sillaDeMontar;
  Persona jinete;
  int pista;
  int posicion;
  boolean ganador;
  int dopaje;

  public Caballo(String nombre, int velocidad) {
    this.nombre = nombre;
    this.velocidad = velocidad;
    this.posicion = 0;
  }

  public String getNombre() {
    return nombre;
  }

  public boolean isGanador() {
    return ganador;
  }

  public int getDopaje() {
    return dopaje;
  }

  public Persona getJinete() {
    return jinete;
  }

  public int getPosicion() {
    return posicion;
  }

  public double getPeso() {
    return peso;
  }

  public int getAltura() {
    return altura;
  }

  public String getColor() {
    return color;
  }

  public int getPista() {
    return pista;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public String getRaza() {
    return raza;
  }

  public String getSillaDeMontar() {
    return sillaDeMontar;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setDopaje(int dopaje) {
    this.dopaje = dopaje;
  }

  public void setGanador(boolean ganador) {
    this.ganador = ganador;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPista(int pista) {
    this.pista = pista;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setSillaDeMontar(String sillaDeMontar) {
    this.sillaDeMontar = sillaDeMontar;
  }

  public void setPosicion(int posicion) {
    this.posicion = posicion;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }
  
  public boolean lanzaGranada(Caballo enemigo) {
    boolean objetivo = false;
    int probabilidad = (int)(Math.random() * 3);
    
    switch (probabilidad) {
      case 0:
      case 1:
        objetivo = false;
        break;
      case 2:
        objetivo = true;
        break;
    }
    return objetivo;
  }
  
  @Override
  public String toString() {
    return 
      "\n◉ Ficha técnica del caballo: \n" +
      "❶ Nombre: " + this.nombre + "\n" +
      "❷ Velocidad máxima: " + this.velocidad;
  }
}


