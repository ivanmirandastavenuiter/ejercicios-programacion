/**
 * Ejercicio12
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio12 {
  public static void main(String[] args) {
  
  int iteraciones = 10000000;
  int numero;
  
  for (int i = 0; i < iteraciones; i++) {
  
    numero = (int)(Math.random() * 95 + 32);
    
    char caracter = (char)(numero);
    System.out.print("\033[32m" + caracter + " ");
    }
  }
}
