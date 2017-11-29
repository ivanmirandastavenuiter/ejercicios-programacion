/**
 * Ejercicio19
 * 
 * Escribe un programa que muestre 50 números enteros aleatorios comprendi-
 * dos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio19 {
  public static void main(String[] args) {
  
  long numero;
  long maximoPar = -100;
  long minimoImpar = 999999;
  long contador = 0;
  long suma = 0;
    
  for (int i = 0; i < 50; i++) {
    
    numero = (long)(Math.random() * 301 + (-100));
    System.out.print(numero + " ");
    
    suma += numero;
    contador++;
    
    if (numero % 2 == 0) {
      
      if (numero > maximoPar) {
        maximoPar = numero;
      }
    }
    
    if (numero % 2 != 0) {
      
      if (numero < minimoImpar) {
        minimoImpar = numero;
      }
    }
  } System.out.println();
    System.out.println();
    System.out.println("El máximo número de los pares es " + maximoPar);
    System.out.println("El mínimo número de los impares es " + minimoImpar);
    System.out.println("La media de todos los números es " + suma / contador);
  }
}
    
  
    

