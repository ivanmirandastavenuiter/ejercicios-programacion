/*
 * Definición de la clase Pizza.
 */
package ejercicio05;

/**
 *
 * @author Iván Miranda.
 */
public class Pizza {
  
  String tamano;
  String tipo;
  String estado;
  private static int servidas;
  private static int pedidas;

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.pedidas++;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
      System.out.println("Se procede a servir la pizza " + this.tipo + " " 
      + this.tamano + ".");
      this.estado = "servida";
      Pizza.servidas++;
    } else if (this.estado.equals("servida")) {
      System.out.println("La pizza " + this.tipo + " " + this.tamano + 
        " ya se ha servido previamente.");
    }
  }
  
  public String getTamano() {
    return tamano;
  }

  public String getTipo() {
    return tipo;
  }

  public String getEstado() {
    return estado;
  }

  public static int getServidas() {
    return servidas;
  }

  public static int getPedidas() {
    return pedidas;
  }

  public void setTamano(String tamano) {
    this.tamano = tamano;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public static void setServidas(int servidas) {
    Pizza.servidas = servidas;
  }

  public static void setPedidas(int pedidas) {
    Pizza.pedidas = pedidas;
  }
  
  @Override
  public String toString() {
    String respuesta = "";
    if (this.estado.equals("pedida")) {
      respuesta = "Se ha pedido una pizza " + this.tipo + " "
      + this.tamano;
    } else if (this.estado.equals("servida")) {
      respuesta = "La pizza " + this.tipo + " " + this.tamano + " ya"
        + " se ha servido.";
    }
    return respuesta;
  }
}
