/**
 * Ejercicio09
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio09 {
  public static void main(String[] args) {
    
  int[] n = new int[8];
  int num;
  
  System.out.println("Introduce 8 números seguidos. A continuación se ");
  System.out.println("mostrarán tanto los pares como los impares.");
  System.out.println();
  
  for (int i = 0; i < 8; i++) {
    num = Integer.parseInt(System.console().readLine());
    n[i] = num;
  }
  
  System.out.println();
  System.out.println("El resultado es este: ");
  System.out.println();
  
  for (int i = 0; i < 8; i++) {
    
    if (n[i] % 2 == 0) {
      System.out.println(n[i] + ": par.");
    } else {
      System.out.println(n[i] + ": impar.");
      }
    }
  }
}
