/**
 * Ejercicio25
 * 
 * Escribe un programa que muestre por pantalla 100 números enteros separa-
 * dos por un espacio. Los números deben estar generados de forma aleatoria
 * en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio25 {
  public static void main(String[] args) {
    
  int iteraciones = 100;
  int numero;
  int primo;
  
  for (int i = 0; i < iteraciones; i++) {
    
    primo = 0;
    
    numero = (int)(Math.random() * 191 + 10);
    
    for (int r = 2; r < numero; r++) {
      
      if (numero % r == 0) {
        primo++;
      }
    }
    
    if (primo == 0) {
      System.out.print("#" + numero + "# "); 
    }
    
    if (numero % 5 == 0) {
      System.out.print("[" + numero + "] ");
    }
      
    if ((primo > 0) && (numero % 5 != 0)) {
      System.out.print(numero + " ");
      }
    }
  }
}
    
    
    
    
    
