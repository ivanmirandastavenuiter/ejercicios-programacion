/**
* Ejercicio23
* 
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio23 {
  public static void main(String[] args) {
    
    //Para realizar el programa, lo más adecuado aquí sería do-while, y que
    //el programa pida un número a cada vuelta mientras num < 10000. En 
    //cada vuelta, poner además, un contador que indique los números al 
    //final, que sirva como divisor también, y una variable que acumule
    //la suma. El valor que no debe superar es el de la suma, NO el del
    //número introducido.
    
    System.out.println("Este programa pide números de forma consecutiva");
    System.out.println("hasta que la suma de todos ellos llegue a un máximo");
    System.out.println("de 10000. Llegado a ese punto, mostrará el total");
    System.out.println("acumulado, la cantidad de números introducidos y");
    System.out.println("la media de la suma.");
    
    int suma = 0;
    int contador = 0;
    
    do {
      
      System.out.println("\nIntroduce un número: ");
      int num = Integer.parseInt(System.console().readLine());
      
      suma += num;
      contador++;
      
    } while (suma <= 10000); {
      
        System.out.println("El total acumulado es de " + suma + ".");
        System.out.println("Se han introducido " + contador + " números.");
        System.out.println("La media de la suma total es de " + (suma / contador) + ".");
      }
    }
  }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
