/**
* Ejercicio43
* 
* Escribe un programa que permita partir un número introducido por teclado en
* dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
* el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
* el número introducido tiene dos dígitos como mínimo y la posición en la que
* se parte el número está entre 2 y la longitud del número. No se permite en
* este ejercicio el uso de funciones de manejo de String (por ej. para extraer
* subcadenas dentro de una cadena).

* Ejemplo:
*
* Por favor, introduzca un número entero positivo: 406783
* Introduzca la posición a partir de la cual quiere partir el número: 5
* Los números partidos son el 4067 y el 83.

* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio43 {
  public static void main(String[] args) {
    
    System.out.println("Este programa parte un número por dónde prefieras.");
    System.out.println("Elige un número cualquiera: ");
    long num = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("Ahora pon el lugar donde quieres partir el número: ");
    long posicionUsuario = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    long posicionVolteo = 1;
    long volteado = 0;
    long auxNum = num;
    long modulo;
    long primeraParte = 0;
    long segundaParte = 0;
    
    while (auxNum > 0) {
      
      modulo = auxNum % 10;
      volteado = volteado* 10 + modulo;
      auxNum /= 10;
       
     }
     
     long moduloDos;
     long auxVolteado = volteado;
     
     //Primera parte
     
    while (posicionVolteo < posicionUsuario) {
      
      moduloDos = auxVolteado % 10;
      primeraParte = primeraParte * 10 + moduloDos;
      posicionVolteo++;
      auxVolteado /= 10;
    }
    
    //Segunda parte
    
    long moduloTres;
    
    while (auxVolteado > 0) {
      
      moduloTres = auxVolteado % 10;
      segundaParte = segundaParte * 10 + moduloTres;
      auxVolteado /= 10;
    }
    
    System.out.println("La primera parte del número es " + primeraParte + " y la segunda es " + segundaParte + ".");
  }
}
  
      
 
      
      
      
      
      
  
