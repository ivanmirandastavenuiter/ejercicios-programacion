/**
 * Ejercicio07
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio07 {
  public static void main(String[] args) {
  
  int[] n = new int[100];
  int numero;
  
  for (int i = 0; i < 100; i++) {
    
    numero = (int)(Math.random() * 21);
    
    System.out.print(numero + " ");
    n[i] = numero;
  }

  System.out.println();
  
  System.out.print("Ahora introduce algún número de los que aparezcan: ");
  int primero = Integer.parseInt(System.console().readLine());
  
  System.out.print("Cada número anterior se cambiará por el que pongas ahora: ");
  int segundo = Integer.parseInt(System.console().readLine());
  
  for (int i = 0; i < 100; i++) {
    
    if (n[i] == primero) {
      System.out.print("\033[33m'" + segundo + "'" + " ");
    } else {
      System.out.print("\033[37m" + n[i] + " ");
      }
    }
  } 
}

    

