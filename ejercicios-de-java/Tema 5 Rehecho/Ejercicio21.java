/**
* Ejercicio21
* 
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Este programa indica la cantidad de números que introduzcas,");
    System.out.println("la media de los impares y el mayor de los pares. El programa");
    System.out.println("terminará al introducir un número negativo.");
    
    //Estructura principal del ejercicio: hacerlo con un do-while que contenga
    //la petición de número a cada vuelta. El while > 0. En el while poner un
    //print que ponga un mensaje de error. La cantidad de números introducidos
    //se hace con el contador. Se puede hacer con contador - 1 o bien con 
    //el contador dentro de if > 0 o if < 0. Para la media de los impares,
    //comprobar si el resto es != 0, sumarlos y dividirlos por los introducidos
    //para tener la media. 
    
    int numIntroducidos = 0;
    int num;
    int sumaImpares = 0;
    int impares = 0;
    int aux = 0;
    
    do {
      System.out.println("Introduce un número: ");
      num = Integer.parseInt(System.console().readLine());
      
        if (num % 2 != 0) {
          sumaImpares += num;
          impares++;
        }
        
        if (num % 2 == 0) {
          
          if (num > aux) {
            aux = num;
        }
      }
      numIntroducidos++;
    } while (num >= 0);
    
        System.out.println("\nSe han introducido " + numIntroducidos + " números.");
        System.out.println("La media de los impares es " + (sumaImpares / impares) + ".");
        System.out.println("El número par más alto es " + aux + ".");
      }
    }
  

      
      
    
