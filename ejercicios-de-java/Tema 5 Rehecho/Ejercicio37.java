/**
* Ejercicio37
* 
* Realiza un conversor del sistema decimal al sistema de “palotes”.
* Ejemplo:
* Por favor, introduzca un número entero positivo: 47021
* El 470213 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio37 {
  public static void main(String[] args) {
    System.out.println("Este programa convierte un número decimal a palotes.");
    System.out.println("Pon un número, de la longitud que quieras: ");
    long num = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    //El sistema lee de izquierda a derecha. Hay que voltearlo.
    
    long aux = 0;
    long volteado = 0;
    long numAux = num;
    
    while (numAux > 0) {
    
      aux = numAux % 10;
      volteado = volteado * 10 + aux;
      numAux /= 10;
    }
    
    //Una vez obtenido el número del revés, se hace módulo a módulo y se
    //hace un bucle for, por ejemplo, en cada pasada, que reproduzca  
    //tantos palotes como indique la cifra.
    
    long auxVolteado = 0;
    
    while (volteado > 0) {
      
      auxVolteado = volteado % 10;
      
      if (auxVolteado == 0) {
        System.out.print("- ");
      } else {
        
        for (int i = 0; i < auxVolteado; i++) {
          
          System.out.print("| ");
        }
    
          if (volteado > 10) {
            System.out.print("- ");
          } else {
            System.out.println();
          }
      }
        volteado /= 10;
      }
    }
  }
      
    
        
       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
