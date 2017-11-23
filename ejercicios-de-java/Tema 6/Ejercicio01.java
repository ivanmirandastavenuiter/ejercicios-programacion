/**
 * Ejercicio01
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    int suma = 0;
    
    for (int i = 0; i < 3; i++) {
      int x = (int)(Math.random() * 6 + 1);
      System.out.println(x);
      suma += x;
      }
      System.out.println("La suma total de los dados es de " + suma);
    }
  }
