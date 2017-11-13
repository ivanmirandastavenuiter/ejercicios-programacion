/**
* Ejercicio31
* 
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
* programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
* mitad (división entera entre 2) de la altura más uno.
* Ejemplo:
* Introduzca la altura de la L: 5
* 
*   *
*   *
*   *
*   *
*   * * *
*
* Ejemplo:
* Por favor, introduzca la primera hora.
* Día: lunes
* Hora: 18
* Por favor, introduzca la segunda hora.
* Día: martes
* Hora: 20
* Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio31 {
  public static void main(String[] args) {
    
    //Pedir la altura de la letra por teclado y hacer dos bucles for: uno
    //para cada una de las líneas. El primero con la altura y el segundo
    //con altura / 2.
    
    System.out.println("Este programa pinta una L en pantalla. Lo único que");
    System.out.println("tienes que hacer es introducir la altura que desees: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int lineaBaja = (altura / 2) + 1;
    
    do {
      
      for (int i = 1; i > 0; i--);
        System.out.println("*");
        altura--;
      } while (altura > 0);
      
    for (int i = 0; i < lineaBaja; i++) {
        System.out.print("* ");
      }
     }
   }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
