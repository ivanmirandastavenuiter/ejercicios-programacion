/**
* Ejercicio27
* 
* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
* entre 1 y un número leído por teclado.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio27 {
  public static void main(String[] args) {
    
  //Este programa pide que se muestren, cuenten y sumen los múltiplos 
  //de tres que hay entre 1 y un número introducido por pantalla. Lo primero
  //sería hacer un bucle for entre ese número uno y el que el usuario ponga.
  //Con eso ya tenemos la cadena de números que buscamos. Ahora hay que 
  //comprobar si esos números dan como resto == 0 al dividirlos entre 3.
  //En caso de que sí se hace un println y en caso de que no pues no. Además,
  //hay que contarlos con otra variable y hay que sumarlos todos.
  
    System.out.println("Este programa se encarga de encontrar los múltiplos de 3");
    System.out.println("comprendidos entre 1 y el número que elijas.");
    System.out.println("Además, muestra su cantidad y la suma total de todos ellos.");
    System.out.println("Prueba y pon el número que quieras: ");
    int num = Integer.parseInt(System.console().readLine());
    
    //Hacemos el for para empezar a contabilizar
    
    int contador = 0;
    int sumaMultiplos = 0;
    
    //Se inician las variables contador y sumaMultiplos para contar y sumar,
    //respectivamente los números múltiplos de 3.
    
    for (int i = 1; i < num; i++) {
      
      if (i % 3 == 0) {
        System.out.print(i + " ");
        sumaMultiplos += i;
        contador++;
      } 
    }
    System.out.println();
    System.out.println("Se han contado un total de " + contador + " múltiplos de 3.");
    System.out.println("La suma total de los múltiplos es de " + sumaMultiplos + ".");
  }
}
      
  
  
