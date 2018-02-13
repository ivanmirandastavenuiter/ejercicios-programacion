/*
 * Definición de la clase Zona.
 */
package ejercicio07;

/**
 *
 * @author Iván Miranda.
 */

import java.util.Scanner;

public class Zona {
  
  private static int general;
  
  Scanner sc = new Scanner(System.in);
  
  private int entradasRestantes;
  private int entradasVendidas;
  
  public Zona(int entradasRestantes) {
    this.entradasRestantes = entradasRestantes;
  }

  public static int getGeneral() {
    return general;
  }

  public int getEntradasVendidas() {
    return entradasVendidas;
  }

  public static void setGeneral(int general) {
    Zona.general = general;
  }

  public void setEntradasVendidas(int entradasVendidas) {
    this.entradasVendidas = entradasVendidas;
  }

  public int getEntradasRestantes() {
    return entradasRestantes;
  }

  public void setEntradasRestantes(int entradasRestantes) {
    this.entradasRestantes = entradasRestantes;
  }
  
  public void vender(int vendidas) {
    
    String respuesta;
    if (this.entradasRestantes == 0) {
      System.out.println("Lo siento, no me quedan entradas de esa zona.");
    } else if (this.entradasRestantes < vendidas) {
      System.out.println("Solo me quedan " + this.getEntradasRestantes() + 
        " entradas para esa zona. ¿Las quieres? (Sí / No)");
      respuesta = sc.next().toLowerCase();
      if (respuesta.equals("si")) {
        System.out.println("Aquí tienes tus entradas.");
        this.setEntradasVendidas(this.getEntradasRestantes() + this.getEntradasVendidas());
        Zona.setGeneral(this.getEntradasRestantes() + Zona.getGeneral());
        this.setEntradasRestantes(0);
      } else {
        System.out.println("De acuerdo, si consigo más te aviso.");
      }
    } else if (this.entradasRestantes >= vendidas) {
      System.out.println("Aquí tienes tus entradas");
      this.entradasRestantes -= vendidas;
      this.setEntradasVendidas(this.getEntradasVendidas() + vendidas);
      Zona.setGeneral(Zona.getGeneral() + vendidas);
    }
  }
  
  @Override
  public String toString() {
    String mensaje;
    mensaje = "\nEntradas libres: " + this.getEntradasRestantes()
      + "\nEntradas vendidas: " + this.getEntradasVendidas();
    return mensaje;
  }
}
  
