/**
 * Ejercicio24
 * 
 * Escribe un programa que, dado un número introducido por teclado, elija al azar
 * uno de sus dígitos.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int aux = num;
    int cifras = 0;
    int digito;
    int posicion = 0;
    
    do {
      aux /= 10;
      cifras++;
    } while (aux > 0);
    
    digito = (int)(Math.random() * cifras + 1);
    
    for (int i = 0; i < cifras; i++) {
      
      aux = num % 10;
      posicion++;
      
      
      if (digito == posicion) {
        System.out.println("El número que he elegido es el " + aux);
      }
      
      num /= 10;
    }
  }
}
      
    
