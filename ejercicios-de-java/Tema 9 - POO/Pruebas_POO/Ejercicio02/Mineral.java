/*
 * Definición de la clase Mineral.
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class Mineral {
  
  // Definición de los atributos.
  
  String color;
  String tipo;
  int valor;
  
  public Mineral() {
    this.valor = 3000;
    this.tipo = "gama media";
  }
  
  public Mineral(int v) {
    this.valor = v; 
  }
  
  public void seVenden() {
    System.out.println("Algunos minerales se venden a precios muy caros.");
  }
  
  public String toString() {
    return "Valor del mineral: " + this.valor + "\n";
  }
}
