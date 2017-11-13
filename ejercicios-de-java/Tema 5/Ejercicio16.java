/**
* Ejercicio16
* 
*Escribe un programa que diga si un número introducido por teclado es o no
*primo. Un número primo es aquel que sólo es divisible entre él mismo y la
*unidad.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Este programa sirve para identificar números primos.");
    System.out.println("Introduce un número cualquiera: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int div = 2;
    int noPrimo = 0;
    
    if (num == 2) {
      System.out.println("El " + num + " sí es un número primo.");
    } else if (num > 2) {
      
      do {
      
        if (num % div == 0) {
          noPrimo++;
          div++;
          } else {
          div++;
          }
      
        } while (div < num);
      
        if (noPrimo > 0) {
          System.out.println("El " + num + " no es un número primo.");
          } else {
          System.out.println("El " + num + " sí es un número primo.");
          }
    }    
  }    
}
        
