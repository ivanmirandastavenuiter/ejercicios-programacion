/**
* Ejercicio24
* 
* Escribe un programa que lea un número n e imprima una pirámide de números
* con n filas como en la siguiente figura:
* 
*    1
*   121
*  12321
* 1234321
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide en la pantalla.");
    System.out.println("Introduce la altura que quieras que tenga y mira el resultado: ");
    int alturaUsuario = Integer.parseInt(System.console().readLine());

    int espacio = alturaUsuario - 1;
    int i = 0;
    int altura = 1;
    
    do {
    
      for (i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
  
      for (i = 1; i <= altura ; i++) {
        System.out.print(i);
      }
      
      for (int n = altura - 1; n > 0; n--) {
          System.out.print(n);
        }
        
        System.out.println();
      
        espacio--; 
        altura++;
        
    } while (altura <= alturaUsuario);
  }
}

