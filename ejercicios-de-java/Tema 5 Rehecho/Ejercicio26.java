/**
* Ejercicio26
* 
* Realiza un programa que pida primero un número y a continuación un dígito.
* El programa nos debe dar la posición (o posiciones) contando de izquierda a
* derecha que ocupa ese dígito en el número introducido.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio26 {
  public static void main(String[] args) {
  //El programa pide introducir un número (de las cifras que sea) y, a
  //continuación, poner el dígito del cual queremos la posición. Entonces,
  //muestra que posición/es ocupa contando desde la izquierda a la derecha.
  //Planteamiento del problema: averiguar, primero, las ciras que tiene el
  //número para calcular las posiciones. A continuación, hacer un do-while
  //que calcule si la última cifra del número introducido coincide con el dígito
  //que se busca y entonces imprimir el mensaje en pantalla. Ir reduciendo
  //cifras y número hasta el final. Poner un else en caso de que el número
  //no sea igual que el dígito y seguir reduciendo la cifra hasta 0.
  
    System.out.println("Este programa te dice en qué posición se encuentra");
    System.out.println("el número que elijas. Primero introduce un número");
    System.out.println("cualquiera y, a continuación, el número cuya posición");
    System.out.println("quieras saber: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("Ahora introduce el dígito: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    int cifra = 0;
    int divisor = 10;
    int aux = num;
    int prueba;
    
    while (num > 0) {
      num = num / divisor;
      cifra++;
    }
    
    do {
      prueba = aux % 10;
        
        if (prueba == digito) {
          System.out.println("El número " + digito + " aparece en la posición " + cifra + ".");
          cifra--;
          aux = aux / 10;
        } else {
          cifra--;
          aux = aux / 10;
        }
        
      } while (cifra > 0);
    }
  }

 
