/*
 * Definición de la clase Persona.
 */
package ejercicio01;

/**
 *
 * @author Iván Miranda
 */
public class Persona {
  
  // Definición de los atributos. 
  
  String nombre;
  String apellidos;
  double peso;
  String destreza;

  public Persona(String nombre, String apellidos, double peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.peso = peso;
  }

  public Persona(String nombre, String destreza) {
    this.nombre = nombre;
    this.destreza = destreza;
  }

  public Persona() {
  }

  public String getDestreza() {
    return destreza;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public double getPeso() {
    return peso;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDestreza(String destreza) {
    this.destreza = destreza;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
  
  public void espolea() {
    System.out.println("Arre arre");
  }
  
  public void espolea(String actitud) {
    switch (actitud) {
      case "agresiva":
        System.out.println("GHIaaaa!!!!");
        break;
      case "suave":
        System.out.println("Corre caballito");
        break;
    }
  }

  @Override // Pone Override porque está definido en la superclase 
            // por defecto Object, que está en la cúspide y que engloba a Persona.
  public String toString() {
    return 
      "\n◉ Ficha técnica del jinete: \n" +
      "❶ Nombre: " + this.nombre + "\n" +
      "❷ Destreza: " + this.destreza + "\n";
  }  
}
