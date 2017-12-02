/**
 * Ejercicio06
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio06 {
  public static void main(String[] args) {
    
  int numeroIntroducido;
  int[] n = new int[15];
  
  for (int i = 0; i < 15; i++) {
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    n[i] = numeroIntroducido;
  }
  
  System.out.println();
  
  System.out.print("El array original es así: ");
  
  for (int i = 0; i < 15; i++) {
    System.out.print(n[i] + " ");
  }  
  
  int a = 0;
  int b = 1;
  int aux = 0;
  
  for (int i = 0; i < 14; i++) {
    aux = n[b];
    n[b] = n[a];
    b++;
    n[a] = aux;
  }
    n[0] = aux;
    
  System.out.println();
  
  System.out.print("El desplazado hacia la derecha es así: ");
    
  for (int i = 0; i < 15; i++) {
     System.out.print(n[i] + " ");
    }
  }
}
    
      

