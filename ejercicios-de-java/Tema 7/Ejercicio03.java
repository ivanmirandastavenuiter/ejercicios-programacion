/**
 * Ejercicio03
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio03 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduce 10 números enteros positivos: ");
  
  int[] num = new int[10];
  
  for (int i = 0; i < 10; i++) {
    num[i] = Integer.parseInt(System.console().readLine());
  }
  
  System.out.println("Los números introducidos al revés son: ");
  
  for (int i = 9; i >= 0; i--) {
    System.out.print(num[i] + " ");
  }
  }
}
    
