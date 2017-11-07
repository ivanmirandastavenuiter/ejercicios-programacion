/**
* Ejercicio18
* 
* Escribe un programa que obtenga los números enteros comprendidos entre
* dos números introducidos por teclado y validados como distintos, el programa
* debe empezar por el menor de los enteros introducidos e ir incrementando de
* 7 en 7.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula los números comprendidos");
    System.out.println("entre dos que introduzcas, avanzando de 7 en 7.");
    
    System.out.println("\nIntroduce el primero de los números: ");
    int primero = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nIntroduce el segundo: ");
    int segundo = Integer.parseInt(System.console().readLine());
    
    if (primero == segundo) {
      System.out.println("\nLos números deben ser distintos.");
    } else {
      
      if (primero < segundo) {
        
        for (int i = primero; i < segundo; i += 7) {
          System.out.println(i);
        }
      } 
      
      if (segundo < primero) {
        
        for (int i = segundo; i < primero; i += 7) {
          System.out.println(i);
        }
      }
    }
  }
} 
        
        
    
