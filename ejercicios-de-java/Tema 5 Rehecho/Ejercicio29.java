/**
* Ejercicio29
* 
* Escribe un programa que muestre por pantalla todos los números enteros
* positivos menores a uno leído por teclado que no sean divisibles entre otro
* también leído de igual forma.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio29 {
  public static void main(String[] args) {
    
    //El programa pide introducir dos números. Los resultantes tienen que 
    //ser menores al primero y no  divisibles por el segundo. Es decir,
    //cumplir las dos condiciones. Se puede hacer con un bucle for que cuente
    //los menores al primero y un segundo con un while, por ejemplo.
    
    System.out.println("Este muestra una serie de números por pantalla a partir");
    System.out.println("de los que introduzcas tú. Los que veas van a ser menores");
    System.out.println("al primero y no divisibles por el segundo. Haz la prueba.");
    System.out.println("Pon el primero: ");
    int numUno = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe otro: ");
    int numDos = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < numUno; i++) {
      
      if (i % numDos == 0) {
        System.out.println(i);
      }
    }
  }
}
