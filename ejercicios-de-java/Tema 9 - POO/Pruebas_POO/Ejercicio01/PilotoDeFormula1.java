/*
 * Ejercicio 1. 
 */
package poo;

/**
 *
 * @author Iván Miranda
 */
public class PilotoDeFormula1 {
  
  // Definición de los atributos de la clase PilotoDeFormula1
  
  String nombre;
  String apellidos;
  String equipo;
  String posicion;
  int numero;
  
  PilotoDeFormula1() {
    this.equipo = "Malboro";
  }
  
  PilotoDeFormula1(String s) {
    this.equipo = s;
  }
  
  public String getEquipo() {
    return this.equipo;
  }
  
  public void setEquipo(String c) {
    this.equipo = c;
  }
}
