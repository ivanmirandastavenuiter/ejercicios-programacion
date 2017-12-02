/**
 * Ejercicio05
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 * del máximo y del mínimo respectivamente.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio05 {
  public static void main(String[] args) {
  
  int numeroIntroducido;
  int mayor = 0;
  int menor = 99999;
  int[] n = new int[10];
  
  System.out.println("Este programa te pide 10 números y te los muestra de nuevo");
  System.out.println("indicando cuál es el máximo y cuál el mínimo.");
  System.out.println("Introduce diez números seguidos: ");
  
  for (int i = 0; i < 10; i++) {
    
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    n[i] = numeroIntroducido;
    
    if (numeroIntroducido > mayor) {
      mayor = numeroIntroducido;
    }
    if (numeroIntroducido < menor) {
      menor = numeroIntroducido;
    }
  }
  
  System.out.println("El resultado sería este: ");
  System.out.println();
    
  for (int r = 0; r < 10; r++) {
    
    if (n[r] == mayor) {
      System.out.println(n[r] + " :" + " máximo");
    } else if (n[r] == menor) {
        System.out.println(n[r] + " :" + " mínimo");
      } else {
        System.out.println(n[r]);
      }
    }
  }
}

    
    
